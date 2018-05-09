package com.vicente.vicentecloudconsumer.controller;

import com.vicente.vicentecloudconsumer.service.FeignHelloService;
import com.vicente.vicentecloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloControler {

    @Autowired
    private HelloService helloServiceImpl;

    @Autowired
    private FeignHelloService feignHystrixFallback;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloServiceImpl.hiService(name);
    }

    @RequestMapping(value = "/ha")
    public String ha(@RequestParam String name){
        return feignHystrixFallback.hi(name);
    }

    @RequestMapping(value = "/aa")
    public String aa(){
        return "aaaaaaaaaa";
    }


}
