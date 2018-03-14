package com.ye.dubbo.statement.service.impl;

import com.ye.db.employee.entity.statement.TbBfOrderFile;
import com.ye.dubbo.statement.service.inf.bf.BfOrderFileService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjx on 2018/3/13.
 */
public class BfOrderFileTest  extends _BastStatementTest{

    @Autowired
    BfOrderFileService bfOrderFileService;

    @Test
    public void getOrderFileInfoById(){
        TbBfOrderFile tbBfOrderFile = bfOrderFileService.selectByPrimaryKey("1");

        System.out.println(tbBfOrderFile.getbBfOrderNo());
    }
}
