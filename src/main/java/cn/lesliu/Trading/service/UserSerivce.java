package cn.lesliu.Trading.service;

import cn.lesliu.Trading.pojo.User;
import cn.lesliu.Trading.pojo.UserDetail;
import cn.lesliu.Trading.pojo.UserDetailKey;

import java.util.List;

public interface UserSerivce {

    /**
     * 注册用户账号密码信息
     * @param user
     * @return
     * @throws Exception
     */
     int registUser(User user) throws Exception;
    /**
     * 注册完善用户详细信息
     * @param userDetail
     * @return
     */
    int registUserDetail(UserDetail userDetail) throws Exception;

    /**
     * 更新用户基本资料
     * @param userDetail
     * @return
     */
    int updateUserDetail(UserDetail userDetail) throws Exception;

    /**
     * 删除用户
     * @param userDetailKey
     * @return
     */
    int removeUser(UserDetailKey userDetailKey)throws Exception;

    /**
     * 获取用户列表
     * @return
     */
    List<UserDetail> selectUserDetail() throws Exception;

    /**
     * 查询用户信息
     * @param userDetailKey
     * @return
     */
    UserDetail selectUserDetailByKey(UserDetailKey userDetailKey) throws Exception;

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User selectUserByUsername(String username) throws Exception;

    /**
     * 查询用户
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    User selectUser(String username,String password) throws Exception;


    UserDetail selectUserById(String id) throws Exception;

    String  getNewUserId() throws Exception;

    /**
     * 获取聊天对象
     * @param currentUser
     * @return
     * @throws Exception
     */
    List selectChatToUsers(User currentUser) throws Exception;

}
