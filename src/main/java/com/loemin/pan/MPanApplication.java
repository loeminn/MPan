package com.loemin.pan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.loemin.pan.mapper")
public class MPanApplication {
    public static void main(String[] args) {
        SpringApplication.run(MPanApplication.class, args);
    }

}
