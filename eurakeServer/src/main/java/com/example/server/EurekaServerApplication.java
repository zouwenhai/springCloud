package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerApplication
 * @Description DOTO
 * @Author zouwenhai
 * @DATE 2019/7/19/13:39
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class  EurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplication.class);
    }
}
