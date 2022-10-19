package com.ffp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaApplication.class, args);
    }
}
