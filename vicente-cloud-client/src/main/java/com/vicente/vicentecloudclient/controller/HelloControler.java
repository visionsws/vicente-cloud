package com.vicente.vicentecloudclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return "hhhhsldfsdklfjdslfjlkdsf";
    }


}
