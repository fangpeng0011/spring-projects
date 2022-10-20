package com.ffp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/19 19:59
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringOpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringOpenFeignApplication.class, args);
    }
}
