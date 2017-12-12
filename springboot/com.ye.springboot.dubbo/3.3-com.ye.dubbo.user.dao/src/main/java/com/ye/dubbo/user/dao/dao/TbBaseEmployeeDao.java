package com.ye.dubbo.user.dao.dao;

import com.ye.dubbo.user.dao.entity.TbBaseEmployee;

/**
 * Created by zjx on 2017/12/11 0011.
 */
public interface TbBaseEmployeeDao {

    TbBaseEmployee selectByPrimaryKey(Integer id);
}
