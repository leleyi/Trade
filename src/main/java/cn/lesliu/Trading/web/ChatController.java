package cn.lesliu.Trading.web;

import cn.lesliu.Trading.common.MessageResult;
import cn.lesliu.Trading.pojo.ChatResp;
import cn.lesliu.Trading.pojo.User;
import cn.lesliu.Trading.service.UserSerivce;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * 处理通知消息的Controller
 * 登录即可访问
 */
@RestController
@RequestMapping("/chat")
public class ChatController {
//    @Autowired
    //HrService hrService;
//    @RequestMapping(value = "/hrs",method = RequestMethod.GET)
//    public List<Hr> getAllHr() {
//        return hrService.getAllHr();
//    }

    @Autowired
    UserSerivce userSerivce;

    @ApiOperation("获取聊天对象")
    @GetMapping("/users")
    public MessageResult getUsers(User currentUser){
        MessageResult messageResult;
        try {
            List users = userSerivce.selectChatToUsers(currentUser);
            messageResult = new MessageResult("获取人员列表成功",200,users);
        } catch (Exception e) {
            messageResult = new MessageResult("获取人员列表失败",500);
        }
        return messageResult;
    }


}
