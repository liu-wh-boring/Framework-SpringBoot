package com.chapter08.swagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Api(tags="用户信息访问")
@RestController
@RequestMapping("/user")
public class UserController
{
    @ApiOperation(value = "新增用户",notes = "前端对用户信息进行必要的判断，后端不对信息进行二次检查")
    @ApiResponses({
            @ApiResponse(code=200,message = "成功返回",response = User.class)
    })
    @PostMapping("/")
    public User add(@RequestBody User user)
    {
        System.out.println(user);
        return user;
    }


    @DeleteMapping(value="/{id}")
    @ApiParam(name="id",value = "用户主键")
    public void delete(@PathVariable long id)
    {
        System.out.println(id);
    }


    @PutMapping("/")
    @ApiImplicitParam(name="user",value="用户信息",dataType = "User",paramType = "body")
    public User update(@RequestBody User user)
    {
        System.out.println(user);
        return user;
    }


    @PatchMapping(value="/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户主键",required = true,paramType = "path"),
            @ApiImplicitParam(name="name",value="用户名",required = true)
    })
    public User update(@PathVariable long id,@RequestParam(value="name",required = true) String name)
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        return new User(12,"李四","zhang");
    }

    @GetMapping("/")
    public List<User> list(@RequestParam(value="page",required = false)int page,@RequestParam(value="page_size",required = false)int pageSize)
    {
        System.out.println("page="+page);
        System.out.println("page_size = "+pageSize);
        return Arrays.asList(new User(12,"李四","zhang"),new User(12,"张三","zhang"));
    }

    @GetMapping("/{id}")
    public User get(@PathVariable long id)
    {
        System.out.println("id="+id);
        return new User(12,"王五","zhang");
    }
}
