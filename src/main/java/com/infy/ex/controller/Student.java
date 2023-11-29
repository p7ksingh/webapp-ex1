package com.infy.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {

    @RequestMapping(value = { "/student" }, method = RequestMethod.GET)
    @ResponseBody
    public String getStudentInfo() {
        
        return "student belong from India";
   
    }

    @RequestMapping(value = { "/poststudent" }, method = RequestMethod.POST)
    @ResponseBody
    public String postStudentInfo() {
        return "student belong from new delhi";
    }

    @RequestMapping(value = { "/test1", "test2", "test3" })
    @ResponseBody
    public String testStudentInfo() {
        return "student test ....";
    }

    @RequestMapping("pankaj")
    @ResponseBody
    public String test1StudentInfo() {
        return "student test ....";
    }
    // Not working Nmae
    // @RequestMapping(name = "pankaj")
    // @ResponseBody
    // public String test11StudentInfo() {
    // return "student test ....";
    // }
}
