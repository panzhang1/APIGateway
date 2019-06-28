package com.pangu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableZuulProxy
//enable oauth
@EnableResourceServer   
public class ZuulServerApplication {
   
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    } 
}
