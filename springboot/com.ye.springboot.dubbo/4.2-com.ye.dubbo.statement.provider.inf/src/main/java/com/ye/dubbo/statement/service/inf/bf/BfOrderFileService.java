package com.ye.dubbo.statement.service.inf.bf;

import com.ye.db.employee.entity.statement.TbBfOrderFile;

/**
 * Created by zjx on 2018/3/13.
 */
public interface BfOrderFileService {

    int insertSelective(TbBfOrderFile record);
    TbBfOrderFile selectByPrimaryKey(String bId);
}
