package com.ye.dubbo.statement.dao.dao;


import com.ye.db.employee.entity.statement.TbBfOrderFile;

/**
 * Created by zjx on 2018/3/13.
 */
public interface TbBfOrderFileDao {

    int insertSelective(TbBfOrderFile record);
    TbBfOrderFile selectByPrimaryKey(String bId);
}
