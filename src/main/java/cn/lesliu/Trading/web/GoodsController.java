package cn.lesliu.Trading.web;


import cn.lesliu.Trading.common.EmailRunnable;
import cn.lesliu.Trading.common.MessageResult;
import cn.lesliu.Trading.pojo.*;
import cn.lesliu.Trading.service.GoodsService;
import cn.lesliu.Trading.service.UserSerivce;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sun.tools.internal.xjc.reader.xmlschema.BindGreen;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    GoodsService goodsService;

    @Autowired
    UserSerivce userSerivce;

    @Autowired
    ExecutorService executorService;



    @ApiOperation("精选列表")
    @GetMapping("/getFeaturedList")
    public MessageResult getFeaturedList() {
        MessageResult messageResult;

        try {
            List<Goods> goods = goodsService.selectGoodsFeatureList();
            messageResult = new MessageResult("精选列表",200,goods);
        } catch (Exception e) {
            e.printStackTrace();
            messageResult = new MessageResult("获取精选列表失败",500);
        }
        return messageResult;
    }

    @ApiOperation("滚动广告")
    @GetMapping("/getAdvList")
    public MessageResult getAdvList(){
        MessageResult messageResult;
        try {
            List<Goods> goods = goodsService.selectGoodsAdvList();
            messageResult = new MessageResult("广告列表",200,goods);
        }catch (Exception e){
            messageResult = new MessageResult("获取广告列表失败",500);
        }
        return messageResult;
    }

    @ApiOperation("最新商品")
    @GetMapping("/getNewestList")
    public MessageResult getNewestList(){
        MessageResult messageResult;
        try {
            List<Goods> goods = goodsService.selectGoodsNewestList();
            messageResult = new MessageResult("最新商品列表",200,goods);
        }catch (Exception e){
            messageResult = new MessageResult("获取最新商品列表失败",500);
        }
        return messageResult;
    }

    @ApiOperation("个人商品列表")
    @GetMapping("/getMyGoodsList")
    public MessageResult getMyGoodsList(User user,String keywords){
        MessageResult messageResult;
        try {
            List<Goods> goods ;
            com.github.pagehelper.Page<Object> objects = PageHelper.startPage(user.getPage(), user.getSize());
            if(!"".equals(keywords)){
             goods =goodsService.selectGoodsByName(user.getId(),keywords);
            }else {
              goods = goodsService.selectGoodsOwnerList(user);
            }
            messageResult = new MessageResult("个人商品列表",200,goods);
        }catch (Exception e){
            e.printStackTrace();
            messageResult = new MessageResult("获取个人商品列表失败",500);
        }
        return messageResult;
    }

    @ApiOperation("商品详情")
    @GetMapping("/getGoodsDetail")
    public MessageResult getGoodsDetail(GoodsKey goodsKey){
        MessageResult messageResult;
        try {
            Goods goods = goodsService.selectGoodsDetail(goodsKey);
            List<Goods> similarList = goodsService.selectGoodsSimilarList(goods.getCategories());
            List<Goods> hisGoodsList = goodsService.selectGoodsHisList(goods.getOwner());
            Map dataMap = new HashMap();
            dataMap.put("goodsDetail",goods);
            dataMap.put("similarList",similarList);
            dataMap.put("hisGoodsList",hisGoodsList);
            messageResult = new MessageResult("商品详情",200,dataMap);
        } catch (Exception e) {
            e.printStackTrace();
            messageResult = new MessageResult("获取商品详情失败",500);
        }
        return messageResult;
    }

    @ApiOperation("喜欢的商品")
    @GetMapping("/enjoyGoods")
    public MessageResult enjoyGoods(GoodsKey goodsKey){
        MessageResult messageResult;
        try {
            int i = goodsService.enjoyGoods(goodsKey);
            messageResult = new MessageResult("喜欢的商品",200,i);
        }catch (Exception e){
            messageResult = new MessageResult("喜欢的商品失败",500);
        }
        return messageResult;
    }


    @ApiOperation("图片文件上传")
    @PostMapping("/uploadImages")
    public MessageResult uploadImages(HttpServletRequest request, MultipartFile file){
        MessageResult messageResult;
        System.out.println(file);
        try {
            String filePath = "E:\\WORK\\SchoolWork\\毕业设计\\allimages";
            File file1 = new File(filePath + "/" + file.getOriginalFilename());
            if(file1.getParentFile().exists()){
                    file1.getParentFile().mkdir();
            }
            file.transferTo(file1);
            messageResult = new MessageResult("图片文件上传成功",200,filePath + "/" + file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
            messageResult = new MessageResult("图片文件上传失败",500);
        }
        return messageResult;
    }

    @ApiOperation("图片文件删除")
    @PostMapping("/deleteImages")
    public MessageResult deleteImages(HttpServletRequest request, MultipartFile file){
        MessageResult messageResult;
        System.out.println(file);
        try {
            String filePath = "E:\\WORK\\SchoolWork\\毕业设计\\allimages";

            messageResult = new MessageResult("图片文件上传成功",200);
        } catch (Exception e) {
            e.printStackTrace();
            messageResult = new MessageResult("图片文件上传失败",500);
        }
        return messageResult;
    }

    @ApiOperation("获取物品id")
    @GetMapping("/getNewGoodsId")
    public MessageResult getNewGoodsId(){
        MessageResult messageResult;
        try {
            String format = String.format("%08d", Integer.parseInt(goodsService.getNewGoodsId()) + 1);
            messageResult = new MessageResult("获取物品id成功",200,format);
        } catch (Exception e) {
            e.printStackTrace();
            messageResult = new MessageResult("获取物品id失败",500);
        }
        return messageResult;
    }

    @ApiOperation("添加或更新商品")
    @PostMapping("/addOrUpdateGoods")
    public MessageResult addOrUpdateGoods(Goods goods, BindingResult bindingResult){
        MessageResult messageResult;
        try {
            GoodsKey goodsKey = new GoodsKey(goods.getId(),goods.getOwner());
            Goods goods1 = goodsService.selectGoodsDetail(goodsKey);
            if(goods1!=null){
                goodsService.updateGoodsDetail(goods);
            }
            goodsService.insertGoods(goods);
            messageResult = new MessageResult("添加物品成功",200);
        } catch (Exception e) {
            messageResult = new MessageResult("添加物品失败",500);
        }
        return messageResult;
    }

    @ApiOperation("删除商品")
    @DeleteMapping("/deletePersonalGoods")
    public MessageResult deletePersonalGoods(String ids){
        MessageResult messageResult;
        try {
            int i = goodsService.deleteGoodsDetail(ids);
            messageResult = new MessageResult("添加物品成功",200);
        } catch (Exception e) {
            messageResult = new MessageResult("添加物品失败",500);
        }
        return messageResult;
    }

    @ApiOperation("根据商品名查询商品")
    @GetMapping("/getGoodsListByName")
    public MessageResult getGoodsListByName(String id, String name, Integer page,Integer size){
        MessageResult messageResult;
        try {
            com.github.pagehelper.Page<Object> objects = PageHelper.startPage(page, size);
            List<Goods> list = goodsService.selectGoodsByName(id,name);
            messageResult = new MessageResult("添加物品成功",200);
        } catch (Exception e) {
            messageResult = new MessageResult("添加物品失败",500);
        }
        return messageResult;
    }

    @ApiOperation("添加或删除商品图片地址")
    @PostMapping("/addOrUpdateGoodsImgs")
    public MessageResult addOrUpdateGoods(ArrayList<GoodsImg> images){
        MessageResult messageResult;
        try {
            goodsService.insertGoodsImgs(images);
            messageResult = new MessageResult("添加图片成功",200);
        } catch (Exception e) {
            messageResult = new MessageResult("添加图片失败",500);
        }
        return messageResult;
    }


    @ApiOperation("发送购物意愿以及心里价位")
    @PostMapping("/sendEmailMessage")
    public MessageResult sendMessageForGoods(EmailMessages emailMessages, HttpServletRequest request, BindingResult bindingResult){

        MessageResult messageResult;
        try {
            //获取卖家详细信息
            UserDetail seller = userSerivce.selectUserById(emailMessages.getGoodsownerid());
            //获取商品详细信息
            Goods goods = goodsService.selectGoodsDetail(new GoodsKey(emailMessages.getGoodsid()));
            //获取买家详细信息
            emailMessages.setGoodsname(goods.getName());
            executorService.execute(new EmailRunnable(seller,emailMessages));
            messageResult = new MessageResult("您的消息已经发送到了卖家邮箱--等回复",200);
        } catch (Exception e) {
            messageResult = new MessageResult("消息已经发送失败",500);
        }
        return messageResult;

    }



}
