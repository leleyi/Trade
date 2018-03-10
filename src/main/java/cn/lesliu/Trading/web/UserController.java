package cn.lesliu.Trading.web;


import cn.lesliu.Trading.common.MessageResult;
import cn.lesliu.Trading.pojo.User;
import cn.lesliu.Trading.pojo.UserDetail;
import cn.lesliu.Trading.service.UserSerivce;
import cn.lesliu.Trading.utils.HttpContextUtils;
import cn.lesliu.Trading.utils.PasswordHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

@EnableSwagger2
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserSerivce userSerivce;

    @ApiOperation("根据用户名查询用户")
    @GetMapping("/getUserByUsername")
    public MessageResult getUser(String username) {
        MessageResult result;

        try {
            User user = userSerivce.selectUserByUsername(username);
            result = new MessageResult("查询成功", 200, user);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("查询失败", 500);
        }

        return result;
    }


    @ApiOperation("用户注册")
    @PostMapping("/register")
    public MessageResult register(User user,String email) {
        MessageResult result;
        //用户密码MD5加密
        PasswordHelper.encryptPassword(user);
        try {
            String format = String.format("%08d", Integer.parseInt(userSerivce.getNewUserId()) + 1);
            user.setId(format);
            user.setEnable(1);
            //获取新用户id
            userSerivce.registUser(user);
            userSerivce.registUserDetail(new UserDetail(user.getId(),user.getUsername(),email));
            result = new MessageResult("注册成功", 200);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("注册失败", 500);
        }
        return result;
    }

    @ApiOperation("用户是否存在")
    @GetMapping("/isExist")
    public MessageResult isExist(String username){
        MessageResult result;
        try {
            User user = userSerivce.selectUserByUsername(username);
            if(null!=user){
                result = new MessageResult("用户存在", 500);
            } else {
                result = new MessageResult("用户存在", 200);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("注册失败", 500);
        }
        return result;
    }

    @ApiOperation("添加用户详细信息")
    @PostMapping("/registDetail")
    public MessageResult registDetial(UserDetail userDetail) {
        MessageResult result;

        try {
            User user = userSerivce.selectUserByUsername(userDetail.getUsername());
            userDetail.setId(user.getId());
            userDetail.setRegistdate(new Date());
            userSerivce.registUserDetail(userDetail);
            result = new MessageResult("注册成功", 200);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("注册失败", 500);
        }

        return result;
    }

    @ApiOperation("获取用户")
    @PostMapping("/getUser")
    public MessageResult getUser(User user) {
        MessageResult result;

        PasswordHelper.encryptPassword(user);
        try {
            User ouser = userSerivce.selectUser(user.getUsername(), user.getPassword());
            result = new MessageResult("当前用户存在", 200);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("用户不存在", 500);
        }

        return result;
    }

    @ApiOperation("用户登陆")
    @PostMapping("/login")
    public MessageResult login(User user) {
        MessageResult result;
        PasswordHelper.encryptPassword(user);
        try {
            User ouser = userSerivce.selectUser(user.getUsername(), user.getPassword());
            if(ouser != null){
                HttpContextUtils.setSession("user", ouser);
                result = new MessageResult("登录成功", 200,ouser);
            }else {
                result = new MessageResult("用户名或密码错误，请重新输入", 400);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("系统繁忙", 500);
        }
        return result;
    }

    @ApiOperation("登陆状态")
    @GetMapping("/loginStatus")
    public MessageResult loginStatus(){
        MessageResult result;
        try {
            User user = (User)HttpContextUtils.getSession("user");
            if(user!=null){
                result = new MessageResult("已经登陆", 200,user);
            }else {
                result = new MessageResult("未登录", 500);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("系统繁忙", 500);
        }
        return result;
    }

    @ApiOperation("退货登陆")
    @PostMapping("/checkout")
    public MessageResult checkout(HttpServletRequest request){

        MessageResult result;
        try {
            HttpSession session = request.getSession(false);
//            HttpContextUtils.setSession("user",null);
            session.removeAttribute("user");
            session.invalidate();
            result = new MessageResult("退出成功", 200);
        } catch (Exception e) {
            e.printStackTrace();
            result = new MessageResult("系统繁忙", 500);
        }
        return result;
    }

}
