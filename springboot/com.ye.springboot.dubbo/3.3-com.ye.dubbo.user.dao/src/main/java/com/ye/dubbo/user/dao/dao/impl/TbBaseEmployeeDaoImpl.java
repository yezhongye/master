package com.ye.dubbo.user.dao.dao.impl;

import com.ye.dubbo.user.dao.dao.TbBaseEmployeeDao;
import com.ye.dubbo.user.dao.entity.TbBaseEmployee;
import com.ye.dubbo.user.dao.mapper.TbBaseEmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zjx on 2017/12/11 0011.
 */
@Repository
public class TbBaseEmployeeDaoImpl implements TbBaseEmployeeDao{

    @Autowired
    TbBaseEmployeeMapper tbBaseEmployeeMapper;

    @Override
    public TbBaseEmployee selectByPrimaryKey(Integer id) {
        return tbBaseEmployeeMapper.selectByPrimaryKey(id);
    }
}
