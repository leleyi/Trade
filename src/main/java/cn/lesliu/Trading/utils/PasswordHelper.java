package cn.lesliu.Trading.utils;

import cn.lesliu.Trading.pojo.User;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {
    //private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    static   String  algorithmName = "md5";
    static  int hashIterations = 2;

    public static void encryptPassword(User user) {
        String newPassword = new SimpleHash(algorithmName, user.getPassword(),  ByteSource.Util.bytes(user.getUsername()), hashIterations).toHex();
        user.setPassword(newPassword);
    }
//    public static void main(String[] args) {
//        PasswordHelper passwordHelper = new PasswordHelper();
//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword("admin");
//        passwordHelper.encryptPassword(user);
//        System.out.println(user);
//    }
}
