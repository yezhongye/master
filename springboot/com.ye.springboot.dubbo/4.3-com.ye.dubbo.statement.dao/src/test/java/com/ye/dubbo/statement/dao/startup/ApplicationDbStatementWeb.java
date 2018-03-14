package com.ye.dubbo.statement.dao.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zjx on 2017/11/23 0023.
 */
@SpringBootApplication
@ComponentScan("com.ye.dubbo.statement.dao")
public class ApplicationDbStatementWeb {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDbStatementWeb.class, args);
    }
}
