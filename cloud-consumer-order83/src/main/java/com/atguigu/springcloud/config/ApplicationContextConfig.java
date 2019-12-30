package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2019-12-28 14:58
 */
@Configuration
public class ApplicationContextConfig
{
    //远程调用
    @Bean
    @LoadBalanced     //天生自带负载均衡  不加不行，默认是集群模式
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
