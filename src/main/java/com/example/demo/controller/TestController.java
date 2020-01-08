package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Description
 * @auther zhangzhizhong
 * @create 2019-12-24 15:23
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/index")
    public String index(ModelMap model) {
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info(localDateTime + ":访问");
        // 初始化柜子
        return "ok，DOCKER-test3";
    }
}

