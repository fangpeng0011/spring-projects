package com.ffp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/17 20:48
 */
@Component
public class DataSourceProperties {


    @Value("${server.port}")
    private String port;

    @Value("${spring.jdbc.myself.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.jdbc.myself.datasource.url}")
    private String url;

    @Value("${spring.jdbc.myself.datasource.username}")
    private String username;

    @Value("${spring.jdbc.myself.datasource.password}")
    private String password;


    public String getPort() {
        return port;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "port='" + port + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
