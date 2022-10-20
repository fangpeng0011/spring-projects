package com.ffp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/19 20:25
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringHystrixApplication.class, args);
    }
}
