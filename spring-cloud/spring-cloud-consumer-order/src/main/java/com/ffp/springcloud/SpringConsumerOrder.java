package com.ffp.springcloud;

import com.ffp.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 14:56
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class SpringConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(SpringConsumerOrder.class, args);
    }
}
