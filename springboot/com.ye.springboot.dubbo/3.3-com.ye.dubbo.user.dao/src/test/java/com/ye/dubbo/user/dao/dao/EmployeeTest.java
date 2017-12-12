package com.ye.dubbo.user.dao.dao;

import com.ye.dubbo.user.dao.entity.TbBaseEmployee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by zjx on 2017/12/11 0011.
 */
public class EmployeeTest extends BaseUserTest {

    @Autowired
    TbBaseEmployeeDao tbBaseEmployeeDao;

    @Test
    public void BaseTest(){
        TbBaseEmployee tbBaseEmployee = tbBaseEmployeeDao.selectByPrimaryKey(1);
        System.out.println(tbBaseEmployee.getTrueName());
    }
}
