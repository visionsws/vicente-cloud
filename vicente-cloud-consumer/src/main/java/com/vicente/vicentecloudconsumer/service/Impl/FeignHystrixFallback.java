package com.vicente.vicentecloudconsumer.service.Impl;

import com.vicente.vicentecloudconsumer.service.FeignHelloService;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrixFallback implements FeignHelloService {

    @Override
    public String getuserinfo() {
        return "getuserinfo";
    }

    @Override
    public String getuserinfostr() {
        return "getuserinfostr";
    }

    @Override
    public String info() {
        return "info";
    }

    @Override
    public String hi(String name) {
        return "出现错误了";
    }
}
