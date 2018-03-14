package cn.lesliu.Trading.service.impl;

import cn.lesliu.Trading.dao.UserDetailMapper;
import cn.lesliu.Trading.dao.UserMapper;
import cn.lesliu.Trading.pojo.*;
import cn.lesliu.Trading.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImlp implements UserSerivce{


    @Autowired
    UserDetailMapper userDetailMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public int registUser(User user) throws Exception {
        return userMapper.insert(user);
    }

    @Override
    public int registUserDetail(UserDetail userDetail) throws Exception {
        return  userDetailMapper.insert(userDetail);
    }

    @Override
    public int updateUserDetail(UserDetail userDetail) {
        return 0;
    }

    @Override
    public int removeUser(UserDetailKey userDetailKey) {
        return 0;
    }

    @Override
    public List<UserDetail> selectUserDetail() {
        return null;
    }

    @Override
    public UserDetail selectUserDetailByKey(UserDetailKey userDetailKey) {
        return null;
    }

    @Override
    public User selectUserByUsername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria exampleCriteria = userExample.createCriteria();
        exampleCriteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null && users.size()>0){
            return  users.get(0);
        }
        return null;
    }

    @Override
    public User selectUser(String username, String password) throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria exampleCriteria = userExample.createCriteria();
        exampleCriteria.andUsernameEqualTo(username);
        exampleCriteria.andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null && users.size()>0){
            return  users.get(0);
        }
        return null;
    }

    @Override
    public UserDetail selectUserById(String id) throws Exception {
        UserDetailExample userDetailExample = new UserDetailExample();
        UserDetailExample.Criteria criteria = userDetailExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<UserDetail> userDetails = userDetailMapper.selectByExample(userDetailExample);
        if(userDetails!=null && userDetails.size()>0){
            return  userDetails.get(0);
        }
        return null;
    }

    @Override
    public String  getNewUserId() throws Exception {
        String userid = userMapper.selectMaxUserID();
        return userid == null ? "00000011" : userid;
    }

}