package com.ye.dubbo.user.dao.mapper;

import com.ye.db.employee.entity.pages.PageWhere;
import com.ye.dubbo.user.dao.entity.TbBaseEmployee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBaseEmployeeMapper {
    int insert(TbBaseEmployee record);

    int insertSelective(TbBaseEmployee record);

    TbBaseEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbBaseEmployee record);

    int updateByPrimaryKey(TbBaseEmployee record);

    /*--==================================================华丽分割线==================================================--*/
    List<TbBaseEmployee> selectSelective(@Param("record")TbBaseEmployee record,@Param("pageWhere")PageWhere pageWhere);

}