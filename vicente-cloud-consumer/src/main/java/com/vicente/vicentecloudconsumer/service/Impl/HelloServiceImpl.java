package com.vicente.vicentecloudconsumer.service.Impl;


import com.vicente.vicentecloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://localhost:8762/hi?name="+name,String.class);
    }

}
