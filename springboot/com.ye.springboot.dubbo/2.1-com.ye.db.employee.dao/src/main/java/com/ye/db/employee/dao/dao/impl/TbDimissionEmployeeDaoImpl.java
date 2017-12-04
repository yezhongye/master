package com.ye.db.employee.dao.dao.impl;

import com.ye.db.employee.dao.dao.TbDimissionEmployeeDao;
import com.ye.db.employee.dao.mapper.TbDimissionEmployeeMapper;
import com.ye.db.employee.entity.employee.TbDimissionEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zjx on 2017/11/23 0023.
 */
@Repository
public class TbDimissionEmployeeDaoImpl implements TbDimissionEmployeeDao{

    @Autowired
    public TbDimissionEmployeeMapper tbDimissionEmployee;

    @Override
    public int insert(TbDimissionEmployee record) {
        return tbDimissionEmployee.insert(record);
    }

    @Override
    public int insertSelective(TbDimissionEmployee record) {
        return tbDimissionEmployee.insertSelective(record);
    }

    @Override
    public TbDimissionEmployee selectByPrimaryKey(Integer id) {
        return tbDimissionEmployee.selectByPrimaryKey(id);
    }
}
