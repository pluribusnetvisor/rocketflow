package com.pluribus.netviser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetviserRestApplication {

    public static void main(String[] args) {
    	System.setProperty("spring.thymeleaf.cache", "false");
    	System.setProperty("spring.devtools.restart.enabled", "true");
    	System.setProperty("spring.devtools.livereload.enabled", "true");

        SpringApplication.run(NetviserRestApplication.class, args);
    }
}
