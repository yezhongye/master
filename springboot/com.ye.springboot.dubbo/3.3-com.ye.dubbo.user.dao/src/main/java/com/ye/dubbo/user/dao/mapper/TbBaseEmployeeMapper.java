package com.ye.dubbo.user.dao.mapper;

import com.ye.dubbo.user.dao.entity.TbBaseEmployee;

public interface TbBaseEmployeeMapper {
    int insert(TbBaseEmployee record);

    int insertSelective(TbBaseEmployee record);

    TbBaseEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbBaseEmployee record);

    int updateByPrimaryKey(TbBaseEmployee record);
}