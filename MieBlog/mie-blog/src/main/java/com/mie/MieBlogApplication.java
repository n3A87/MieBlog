package com.mie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 3A87
 * @date 2024/2/23
 */
@SpringBootApplication
@MapperScan("com.mie.mapper")
public class MieBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(MieBlogApplication.class,args);
    }
}
