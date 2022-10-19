package com.ffp.controller;

import com.ffp.DataSourceMyselfConfiguration;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/17 20:42
 */
@RestController
@EnableConfigurationProperties(DataSourcePropertiesBatch.class)
public class HelloSpringBoot {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Autowired
    DataSourceMyselfConfiguration dataSourceMyselfConfiguration;

    @Autowired
    DataSourcePropertiesBatch dataSourcePropertiesBatch;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello SpringBoot ！";
    }


    @RequestMapping("/properties/batch")
    public String whatProperties() {
        return dataSourcePropertiesBatch.toString();
    }

    @RequestMapping("/myself/properties")
    public String selectMyselfProperties() {
        return dataSourceMyselfConfiguration.toString();
    }

}
