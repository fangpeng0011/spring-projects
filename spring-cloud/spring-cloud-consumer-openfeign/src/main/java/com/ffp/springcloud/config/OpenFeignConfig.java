package com.ffp.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/19 20:11
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    public Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }

}
