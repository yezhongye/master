package com.ye.dubbo.provider;

import com.ye.dubbo.provider.inf.MyTest;

/**
 * Created by zjx on 2017/9/25 0025.
 */
public class MyOneTestImpl implements MyTest {

    @Override
    public String sayHello(String name) {
        return "你好，"+name+" 你属于one分组!";
    }
}
