package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName EurekaServerApplication
 * @Description DOTO
 * @Author zouwenhai
 * @DATE 2019/7/19/13:39
 * @Version 1.0
 **/
@SpringBootApplication
@ComponentScan("com.example.api.*")
@EnableFeignClients
public class ApiApplication {

    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class);
    }
}
