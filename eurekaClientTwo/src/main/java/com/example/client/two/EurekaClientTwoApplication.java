package com.example.client.two;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EurekaClientApplication
 * @Description DOTO
 * @Author zouwenhai
 * @DATE 2019/7/19/13:46
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient //@EnableDiscoveryClient
@RestController
@RequestMapping("/api")
public class EurekaClientTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTwoApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {//这种请求，参数必须要带在请求地址后面，否则访问不到
        return "hi " + name + ",I'm from port:" + port;
    }

    @RequestMapping("/getUser")
    public String getUser(@RequestParam String userName) {
        return "hi " + userName + "I'm from port:" + port;
    }
}
