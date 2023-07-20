package com.shinelon.jenkins.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Author Shinelon
 * @Date 17:29 2023/7/20
 * @Version 1.0
 **/
@RestController
@RequestMapping
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("jenkinsDemo is startup");
        return "jenkinsDemo is startup";
    }
}
