package com.configservver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class);
    }

    @RequestMapping("testHealth")
    public String test(){
        System.out.println("============testHealth==============[");
        return "ok-health";
    }
}
