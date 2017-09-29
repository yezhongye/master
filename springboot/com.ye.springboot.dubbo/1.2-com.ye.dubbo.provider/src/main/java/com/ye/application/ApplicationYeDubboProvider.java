package com.ye.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zjx on 2017/9/25 0025.
 */
@SpringBootApplication
@ImportResource("classpath:com-ye-dubbo-provider.xml")
public class ApplicationYeDubboProvider {

    public static void main(String[] args){

        SpringApplication.run(ApplicationYeDubboProvider.class,args);

    }

}
