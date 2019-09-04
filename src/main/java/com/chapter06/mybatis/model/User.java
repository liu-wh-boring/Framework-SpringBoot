package com.chapter06.mybatis.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User
{
    String username;
    String password;
    String patternLock;
}
