package com.chapter08.swagger2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Role
{
    @ApiModelProperty(value="主键ID")
    private long id;

    @ApiModelProperty(value="权限集合")
    private List<String> permits;
}
