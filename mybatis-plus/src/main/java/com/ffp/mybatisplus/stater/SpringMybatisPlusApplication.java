package com.ffp.mybatisplus.stater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 9:59
 */
@SpringBootApplication
@MapperScan("com.ffp.mybatisplus.mapper")
public class SpringMybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisPlusApplication.class, args);
    }
}
