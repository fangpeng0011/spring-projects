package com.ffp;

import com.alibaba.druid.pool.DruidDataSource;
import com.ffp.config.DataSourceMyselfProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/17 21:37
 */
@SpringBootConfiguration
@EnableConfigurationProperties(DataSourceMyselfProperties.class)
public class DataSourceMyselfConfiguration {

    @Autowired
    private DataSourceMyselfProperties dataSourceMyselfProperties ;

    @Bean
    public DataSource createDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dataSourceMyselfProperties.getDriverClassName());
        dataSource.setUrl(dataSourceMyselfProperties.getUrl());
        dataSource.setUsername(dataSourceMyselfProperties.getUsername());
        dataSource.setPassword(dataSourceMyselfProperties.getPassword());
        return dataSource;
    }

}
