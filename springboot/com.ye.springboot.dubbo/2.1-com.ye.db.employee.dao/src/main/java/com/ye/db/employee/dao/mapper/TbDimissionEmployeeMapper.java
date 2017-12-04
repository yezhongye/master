package com.ye.db.employee.dao.mapper;


import com.ye.db.employee.entity.employee.TbDimissionEmployee;

public interface TbDimissionEmployeeMapper {
    int insert(TbDimissionEmployee record);

    int insertSelective(TbDimissionEmployee record);

    TbDimissionEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbDimissionEmployee record);

    int updateByPrimaryKey(TbDimissionEmployee record);
}