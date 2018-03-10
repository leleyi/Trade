package cn.lesliu.Trading.web;


import cn.lesliu.Trading.common.EmailRunnable;
import cn.lesliu.Trading.pojo.EmailMessages;
import cn.lesliu.Trading.pojo.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ExecutorService;

@RestController
@RequestMapping("/hello")
public class HelloWorldController{
    @Autowired
    ExecutorService executorService;
    @GetMapping("/hello")
    public Object helloWorld() {
        List list = new ArrayList<Map>();
        for (int i = 0; i <6 ; i++) {
            Map map = new HashMap();
            map.put("name","衣服");
            map.put("price",20+i);
            list.add(map);
        }
        return list;
    }
    @GetMapping("/newest")
    public Object newest() {
        List list = new ArrayList<Map>();
        for (int i = 0; i <4 ; i++) {
            Map map = new HashMap();
            map.put("name","最新好货");
            map.put("price",30+i);
            list.add(map);
        }
        return list;
    }

    @GetMapping("/sendEmail")
    public Object sendEmailTest(){
        UserDetail userDetail = new UserDetail();
        userDetail.setId("1");
        userDetail.setUsername("王伟");
        userDetail.setEmail("1047228603@qq.com");
        EmailMessages emailMessages = new EmailMessages();
        executorService.execute(new EmailRunnable(userDetail,emailMessages));
        return  "success";
    }
}
