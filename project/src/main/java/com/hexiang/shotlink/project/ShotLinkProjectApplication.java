package com.hexiang.shotlink.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hexiang.shotlink.project.dao.mapper")
public class ShotLinkProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShotLinkProjectApplication.class, args);
    }
}
