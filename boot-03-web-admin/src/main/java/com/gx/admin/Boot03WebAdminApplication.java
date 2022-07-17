package com.gx.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan("com.gx.admin.mapper")
@ServletComponentScan(basePackages = "com.gx.admin")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)
public class Boot03WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot03WebAdminApplication.class, args);
    }

}
