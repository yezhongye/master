package com.ye.db.employee.dao.mapper;


import com.ye.db.employee.entity.employee.TbNewEmployee;

public interface TbNewEmployeeMapper {
    int insert(TbNewEmployee record);

    int insertSelective(TbNewEmployee record);

    TbNewEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbNewEmployee record);

    int updateByPrimaryKey(TbNewEmployee record);
}