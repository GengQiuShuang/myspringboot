package com.zks.service;

import com.zks.model.MyResult;
import com.zks.model.User;

public interface UserService {
    MyResult login(User user);
}
