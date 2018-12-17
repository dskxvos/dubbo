package com.sakura.Controller;

import com.alibaba.fastjson.JSON;
import com.sakura.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumerController")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping("/getConsumer")
    public String getConsumer(){
        return JSON.toJSONString(consumerService.getConsumerUser());
    }
}
