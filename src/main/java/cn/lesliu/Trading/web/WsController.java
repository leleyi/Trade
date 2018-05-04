package cn.lesliu.Trading.web;

import cn.lesliu.Trading.common.MessageResult;
import cn.lesliu.Trading.pojo.ChatResp;
import cn.lesliu.Trading.pojo.User;
import cn.lesliu.Trading.pojo.UserDetail;
import cn.lesliu.Trading.service.UserSerivce;
import cn.lesliu.Trading.utils.HttpContextUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * WebSocket 消息处理类
 */
@Controller
public class WsController {
    @Autowired
    UserSerivce userSerivce;

    @Autowired
    SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/ws/chat")
    @SendTo("/queue/chat")
    public ChatResp handleChat(String msg) throws Exception {
        String destUser = msg.substring(msg.lastIndexOf(";") + 1, msg.length());
        String message = msg.substring(0, msg.lastIndexOf(";"));
        String fromUser = destUser.substring(destUser.lastIndexOf("*") + 1, destUser.length());
        String dest = destUser.substring(0, destUser.length()-fromUser.length()-1);
        return  new ChatResp(message,fromUser);
    }
    @MessageMapping("/ws/nf")
    @SendTo("/topic/nf")
    public String handleNF() {
        return "系统消息";
    }

    @Test
    public void test(){
       String str = "11admin*lesliu";
        String from = str.substring(str.lastIndexOf("*") + 1, str.length());
        String dest = str.substring(0, str.length()-from.length()-1);

    }
}
//        User duser = userSerivce.selectUserByUsername(dest);
//        User fuser = userSerivce.selectUserByUsername(fromUser);
//        userSerivce.chageMessages(duser,fuser);
