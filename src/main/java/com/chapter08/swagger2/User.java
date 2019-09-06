package com.chapter08.swagger2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class User
{
    @ApiModelProperty(value="主键id")
    private Integer id;

    @ApiModelProperty(value="用户名")
    private String name;

    @ApiModelProperty(value="用户密码")
    private String password;

}
