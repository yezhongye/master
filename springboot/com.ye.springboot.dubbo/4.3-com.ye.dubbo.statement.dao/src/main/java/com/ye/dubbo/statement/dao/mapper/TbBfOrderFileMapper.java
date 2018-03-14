package com.ye.dubbo.statement.dao.mapper;


import com.ye.db.employee.entity.statement.TbBfOrderFile;

public interface TbBfOrderFileMapper {
    int insert(TbBfOrderFile record);

    int insertSelective(TbBfOrderFile record);

    TbBfOrderFile selectByPrimaryKey(String bId);

    int updateByPrimaryKeySelective(TbBfOrderFile record);

    int updateByPrimaryKey(TbBfOrderFile record);
}