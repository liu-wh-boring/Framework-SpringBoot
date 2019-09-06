package com.chapter08.swagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Api(tags = "角色信息访问")
@RestController
@RequestMapping(value = "/role")
public class RoleController
{
    @ApiOperation(value="获取角色信息",notes = "可以分页获取，如果不指定分页信息，则获取所有的数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value = "页数",required = false),
            @ApiImplicitParam(name="pageSize",value="每页大小",required = true)
    })
    @ApiResponses({
            @ApiResponse(code=306,message = "传入参数不合法",response = IllegalArgumentException.class),
            @ApiResponse(code=307,message = "逻辑异常",response = IllegalArgumentException.class)
    })
    @GetMapping(value="/")
    public Role list(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer pageSize)
    {
        System.out.println("page="+page+",page-size="+pageSize);
        return new Role(1, Arrays.asList("农业","电力"));
    }

    @ApiOperation(value="新增角色",notes = "所有的角色信息必须都有")
    @ApiImplicitParam(name="role",value="角色信息",required = true,dataType = "Role",paramType = "body")
    @PutMapping
    public Role put(@RequestBody Role role)
    {
        return new Role(1, Arrays.asList("农业","电力"));
    }

}
