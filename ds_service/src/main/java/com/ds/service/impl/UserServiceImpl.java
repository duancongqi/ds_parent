package com.ds.service.impl;

import com.ds.mapper.UserMapper;
import com.ds.pojo.User;
import com.ds.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServcie {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUser() {
        return userMapper.findUser();
    }
}
