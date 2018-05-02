package com.vicente.vicentecloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "aaa")
    public String getmobile(){
        return "11kdfjskldf";
    }

    @RequestMapping(value = "aac")
    public String getPhone(){
        return "aaaaaa";
    }

}
