package com.example.api.controller;

import com.example.api.service.ApiFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
@Slf4j
public class UserApiController {

    @Autowired
    ApiFeign apiFeign;

    @GetMapping("/user/list")
    public String userList() {
        String str = apiFeign.home("hello world");
        log.info("result:{}",str);
        return str;
    }

    @GetMapping("/user/getUser")
    public String getUserName() {
        String str = apiFeign.getUser("jack");
        log.info("result:{}",str);
        return str;
    }
}
