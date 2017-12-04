package com.ye.db.employee.dao.dao;

import com.ye.db.employee.entity.employee.TbNewEmployee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjx on 2017/11/23 0023.
 */
public class TbNewEmployeeTest extends BaseTest{

    @Autowired
    public TbNewEmployeeDao tbNewEmployeeDao;

    @Test
    public void addNewEmployeeTest(){
        TbNewEmployee ne = new TbNewEmployee();
        tbNewEmployeeDao.insert(ne);
    }
    @Test
    public void getNewEmployeeTest(){
        TbNewEmployee ne = tbNewEmployeeDao.selectByPrimaryKey(1);
        System.out.println(ne.getIdNumber());
    }
}
