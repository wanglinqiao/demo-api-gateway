package com.jyall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by wang.linqiao on 2016/11/3.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApp {
    public static void main(String[] args){
        SpringApplication.run(ZuulApiGatewayApp.class,args);
    }
}
