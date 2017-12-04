package com.ye.db.employee.dao.dao;

import com.ye.db.employee.entity.employee.TbDimissionEmployee;

/**
 * Created by zjx on 2017/11/23 0023.
 */
public interface TbDimissionEmployeeDao {

    public int insert(TbDimissionEmployee record);

    public int insertSelective(TbDimissionEmployee record);

    TbDimissionEmployee selectByPrimaryKey(Integer id);
}
