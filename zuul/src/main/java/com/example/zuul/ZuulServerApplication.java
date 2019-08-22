package com.example.zuul;

import com.example.zuul.filter.PreSimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author com.example.zuul.ZuulServerApplication
 * @version v1.0
 * @date 2019/8/21 11:33
 * @work //TODO
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class);
    }

    @Bean
    public PreSimpleFilter preSimpleFilter() {
        return new PreSimpleFilter();
    }
}
