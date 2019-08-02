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
public class EurekaClientTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTwoApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi "+name+",I'm from port:" +port;
    }
}
