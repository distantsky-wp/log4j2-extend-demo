/*
 * Copyright © 2024 By wang-p,All rights reserved.
 */
package org.wp.log4j2.extend.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wang-p
 * @version 1.0.0
 * @class Log4j2ExperimentController
 * @desc
 * @date 2024/5/1
 * @modify
 */
@RestController
public class Log4j2ExperimentController {

    private static final Logger logger = LoggerFactory.getLogger(Log4j2ExperimentController.class);

    private static final String pattern = "yyyy-MM-dd HH:mm:ss.SSS";

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

    @GetMapping("/log4j2/extend/test")
    public String getTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String result = String.format("本次请求时间为：%s", localDateTime.format(formatter));
        logger.debug("this is a debug level log. print time is {}.", LocalDateTime.now().format(formatter));
        logger.info("this is a info level log. print time is {}.", LocalDateTime.now().format(formatter));
        logger.warn("this is a warn level log. print time is {}.", LocalDateTime.now().format(formatter));
        logger.error("this is a error level log. print time is {}.", LocalDateTime.now().format(formatter));
        return result;
    }

}
