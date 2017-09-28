package com.ye.service.web.controller;

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

    @RequestMapping("/index")
    public String home(HttpServletRequest request,HttpServletResponse response,
                       @RequestParam String name){

        return "欢迎 "+name+" 大佬光临！";
    }
}
