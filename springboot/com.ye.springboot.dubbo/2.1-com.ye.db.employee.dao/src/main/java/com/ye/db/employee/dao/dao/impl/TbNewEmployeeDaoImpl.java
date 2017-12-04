package com.ye.db.employee.dao.dao.impl;

import com.ye.db.employee.dao.dao.TbNewEmployeeDao;
import com.ye.db.employee.dao.mapper.TbNewEmployeeMapper;
import com.ye.db.employee.entity.employee.TbNewEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zjx on 2017/11/23 0023.
 */
@Repository
public class TbNewEmployeeDaoImpl implements TbNewEmployeeDao {

    @Autowired
    public TbNewEmployeeMapper tbNewEmployeeMapper;

    @Override
    public int insert(TbNewEmployee record) {
        return tbNewEmployeeMapper.insert(record);
    }

    @Override
    public int insertSelective(TbNewEmployee record) {
        return tbNewEmployeeMapper.insertSelective(record);
    }

    @Override
    public TbNewEmployee selectByPrimaryKey(Integer id) {
        return tbNewEmployeeMapper.selectByPrimaryKey(id);
    }
}
