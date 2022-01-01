package com.zks.service;

import com.zks.dao.UserDao;
import com.zks.model.MyResult;
import com.zks.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public MyResult login(User user) {
        List<User> list = new ArrayList<>();
        list = userDao.login(user);
        MyResult result = new MyResult();
        if (list.size() != 0) {
            result.setCode(0);
            result.setMsg("登陆成功！");
            result.setList(list);
            result.setObj(list.get(0));
        } else {
            result.setCode(1);
            result.setMsg("登陆失败！");
        }
        return result;
    }
}
