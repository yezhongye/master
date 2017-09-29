package com.ye.service.web.controller;

import com.ye.dubbo.provider.inf.MyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zjx on 2017/9/26 0026.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    private MyTest myTest;

    @RequestMapping("/index")
    public String home(HttpServletRequest request,HttpServletResponse response,
                       @RequestParam String name){
    String nameNew = myTest.sayHello(name);
        return "欢迎 "+nameNew+" 大佬光临！";
    }
}
