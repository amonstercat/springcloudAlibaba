package com.lzc.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")  //@Value("${}"):可以获取对应属性文件中定义的属性值。
    String port;

    @RequestMapping("/reduce")
    public  String reduce ()
    {
        System.out.println("扣减库存");
        return "扣减库存"+"当前调用的stock-service port为"+port;
    }
}
