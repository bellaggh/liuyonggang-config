package com.configClient.web;

import com.alibaba.fastjson.JSON;
import com.configClient.config.MyTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Autowired
    private MyTestConfig myTestConfig;

    @RequestMapping("test001")
    public String test(){
        return JSON.toJSONString(myTestConfig);
    }

}
