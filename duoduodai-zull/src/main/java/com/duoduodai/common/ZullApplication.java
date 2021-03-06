package com.duoduodai.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy  //开启Zuul的网关的代理路由功能
@EnableDiscoveryClient //开启Eureka客户端功能
public class ZullApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ZullApplication.class, args);
    }
}
