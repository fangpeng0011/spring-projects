package com.ffp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 14:31
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudPayment {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPayment.class, args);
    }
}
