package com.vicente.vicentecloudconsumer.service;

import com.vicente.vicentecloudconsumer.service.Impl.FeignHystrixFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="service-hi",fallback= FeignHystrixFallback.class)
public interface FeignHelloService {

    @RequestMapping(method = RequestMethod.GET, value = "/getuser")
    public String getuserinfo();

    @RequestMapping(method = RequestMethod.GET, value = "/getuserStr")
    public String getuserinfostr();

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public  String  info();

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public  String  hi(@RequestParam("name") String name);
}
