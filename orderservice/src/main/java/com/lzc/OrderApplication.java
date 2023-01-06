package com.lzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OrderApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(OrderApplication.class,args);
    }

    @Bean
    @LoadBalanced //负载均衡器
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();  //构造器模式
        return  restTemplate;
    }
}
