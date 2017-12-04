package com.ye.db.employee.dao.dao;

import com.ye.db.employee.entity.employee.TbNewEmployee;

/**
 * Created by zjx on 2017/11/23 0023.
 */
public interface TbNewEmployeeDao {
    public int insert(TbNewEmployee record);

    public int insertSelective(TbNewEmployee record);

    public TbNewEmployee selectByPrimaryKey(Integer id);
}
