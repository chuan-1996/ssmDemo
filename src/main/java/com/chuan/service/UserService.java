package com.chuan.service;

import com.chuan.commons.Result;
import com.chuan.commons.isEmpty;
import com.chuan.dao.UserMapper;
import com.chuan.po.UserExample;
import com.chuan.po.User;
import com.chuan.service.vo.UserVO;
import  com.chuan.commons.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qq491
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    BeanMapperService beanMapperService;

    //根据用户名返回一个User
    public User getUserByUserName(String username) {
        return userMapper.getUserByUserName(username);
    }

    //账号密码验证
    public boolean loginCheck(User a,String password){
        return a.getPasswd().equals(PasswordUtil.encryptPassword(password, a.getSalt()));
    }

    //注册
    public Object saveUsers(String name,String realname,String password) {
        User user = getUserByUserName(name);
        if (isEmpty.isObjectNotEmpty(user)) {
            return Result.error("该用户已经存在");
        }
        UserVO uservo = new UserVO();
        uservo.setUsername(name);
        uservo.setRealname(realname);
        uservo.setRole("用户");
        uservo.setId(getUsers().size()+1);
        String salt = PasswordUtil.generateSalt();
        uservo.setSalt(salt);
        uservo.setPasswd(PasswordUtil.encryptPassword(password,salt));
        userMapper.insertSelective(beanMapperService.mapper(uservo,User.class));
        return uservo;
    }

    //修改密码
    public Object updatePassword(UserVO a,String password,String password1,String password2) {
        String oldPassword = PasswordUtil.encryptPassword(password, a.getSalt());
        String newPassword = PasswordUtil.encryptPassword(password1, a.getSalt());
        if (password1.equals("")) {
            return Result.error("新密码不能为空");
        }
        if (!password1.equals(password2)) {
            return Result.error("新密码两次输入不相同");
        }
        if (!oldPassword.equals(a.getPasswd())) {
            return Result.error("原密码输入错误");
        }
        if (newPassword.equals(a.getPasswd())) {
            return Result.error("新密码不能和原密码相同");
        }
        a.setPasswd(newPassword);
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(a.getUsername());
        userMapper.updateByExample(beanMapperService.mapper(a,User.class), userExample);
        return a;
    }
    
    //返回所有用户VO
    public List<UserVO> getUsers() {
        UserExample userExample = new UserExample();
        List<User> userList = userMapper.selectByExample(userExample);
        return beanMapperService.mapperList(userList, UserVO.class);
    }

}

