package com.chapter06.mybatis.dao;

import com.chapter06.mybatis.model.User;
import com.chapter06.mybatis.service.UserService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao
{
    public List<User> selectUsers();
}
