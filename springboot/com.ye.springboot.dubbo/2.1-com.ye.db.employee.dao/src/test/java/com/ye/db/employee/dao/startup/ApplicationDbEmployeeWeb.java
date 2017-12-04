package com.ye.db.employee.dao.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zjx on 2017/11/23 0023.
 */
@SpringBootApplication
@ComponentScan("com.ye.db.employee.dao")
public class ApplicationDbEmployeeWeb {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDbEmployeeWeb.class, args);
    }
}
