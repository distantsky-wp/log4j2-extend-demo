/*
 * Copyright © 2024 By wang-p,All rights reserved.
 */
package org.wp.log4j2.extend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wang-p
 * @version 1.0.0
 * @class Application
 * @desc
 * @date 2024/5/1
 * @modify
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        shutdownHook();
        SpringApplication.run(Application.class, args);
    }

    private static void shutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {

        }));
    }

}