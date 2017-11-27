package org.zk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangkang on 2017/11/27.
 */
@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String hello() {
        logger.debug("hello,debug");
        return "hello";
    }
}
