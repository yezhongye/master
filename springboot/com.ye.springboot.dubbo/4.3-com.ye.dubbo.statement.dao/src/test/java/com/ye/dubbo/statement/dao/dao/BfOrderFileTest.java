package com.ye.dubbo.statement.dao.dao;


import com.ye.db.employee.entity.statement.TbBfOrderFile;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjx on 2018/3/13.
 */
public class BfOrderFileTest extends BaseStatementTest{

    @Autowired
    TbBfOrderFileDao tbBfOrderFileDao;

    @Test
    public void getInfoById(){
        TbBfOrderFile tbBfOrderFile = new TbBfOrderFile();
        tbBfOrderFile = tbBfOrderFileDao.selectByPrimaryKey("1");
        System.out.println(tbBfOrderFile.getbBfOrderNo());
    }
}
