package com.hisense.ssm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SsmApplication {
    private static final Logger logger = LoggerFactory.getLogger(SsmApplication.class);
    @RequestMapping(value = "helloworld")
    public String helloworld(){
        logger.error("helloworld");
        return "helloworld!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SsmApplication.class, args);
    }
}
