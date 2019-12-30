package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2019-12-28 14:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp83
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp83.class,args);
    }
}
