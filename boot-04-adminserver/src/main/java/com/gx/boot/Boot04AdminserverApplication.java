package com.gx.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Boot04AdminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot04AdminserverApplication.class, args);
    }

}
