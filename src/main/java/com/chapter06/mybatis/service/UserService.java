package com.chapter06.mybatis.service;

import com.chapter06.mybatis.dao.UserDao;
import com.chapter06.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public List<User> selectUsers()
    {
        return userDao.selectUsers();
    }

}
