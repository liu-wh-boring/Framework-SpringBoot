package com.chapter07.restful;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private String sex;
}