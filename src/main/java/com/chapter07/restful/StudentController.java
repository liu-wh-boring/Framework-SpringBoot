package com.chapter07.restful;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class StudentController
{

    @RequestMapping(method = RequestMethod.POST,value="/test")
    public boolean add()
    {
        log.info("add");
        return true;
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/test")
    public boolean delete()
    {
        log.info("delete");
        return true;
    }

    @RequestMapping(method = RequestMethod.PUT,value="/test")
    public boolean update()
    {
        log.info("update");
        return true;
    }

    @RequestMapping(method = RequestMethod.GET,value="/test")
    public boolean select()
    {
        log.info("select");
        return true;
    }

    private final static boolean isExists = false;
    @RequestMapping(method = RequestMethod.HEAD,value = "/test/{flag}/{number}")
    public boolean isExists(@PathVariable int number,@PathVariable boolean flag) throws Exception
    {
        log.info("--------------------------------->"+number);
        if(flag)
        {
            throw new OkException();
        }
        else
        {
            throw new NotExistsException();
        }
    }

    @RequestMapping(method = RequestMethod.GET,value = "/ceshi")
    public String request(@RequestParam(value = "time",required = true,defaultValue = "996")String time)
    {
        log.info("-------------->{}",time);
        return time;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/ceshi")
    public Student request(@RequestBody Student student)
    {
        log.info("------------------------->{}",student);
        return student;
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/ceshi")
    public String request2(@RequestBody String student)
    {
        log.info("-------------------------222222222>{}",student);
        return student;
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/ceshi")

    @ResponseStatus(code = HttpStatus.NO_CONTENT,reason = "not exists")
    public static class NotExistsException extends Exception
    {

    }

    @ResponseStatus(code = HttpStatus.OK,reason = "exists")
    public static class OkException extends Exception
    {

    }
}