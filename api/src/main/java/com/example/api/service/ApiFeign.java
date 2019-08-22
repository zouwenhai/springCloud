package com.example.api.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-hi")
public interface ApiFeign {

    @RequestMapping("/hi")
    public String home(@RequestParam String name);

    @RequestMapping("/getUser")
    public String getUser(@RequestParam String userName);

}
