package com.ye.dubbo.statement.service.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zd.yao on 2017/3/23.
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@ComponentScan("com.ye.dubbo.statement.dao,com.ye.dubbo.statement.service")
@ImportResource("classpath:com-ye-dubbo-statement-test-consumer.xml")
public class ApplicationStatementServiceProviderTest {
    public static void main(String[] args) {
        System.out.println("项目启动--BEGIN");
        ApplicationContext ctx = SpringApplication.run(ApplicationStatementServiceProviderTest.class, args);
        System.out.println("项目启动--END");
    }

}
