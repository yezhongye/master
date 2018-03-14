package com.ye.dubbo.statement.dao.dao.impl;

import com.ye.db.employee.entity.statement.TbBfOrderFile;
import com.ye.dubbo.statement.dao.dao.TbBfOrderFileDao;
import com.ye.dubbo.statement.dao.mapper.TbBfOrderFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by zjx on 2018/3/13.
 */
@Repository
public class TbBfOrderFileDaoImpl implements TbBfOrderFileDao {

    @Autowired
    TbBfOrderFileMapper tbBfOrderFileMapper;

    @Override
    public int insertSelective(TbBfOrderFile record) {
        return tbBfOrderFileMapper.insertSelective(record);
    }

    @Override
    public TbBfOrderFile selectByPrimaryKey(String bId) {
        return tbBfOrderFileMapper.selectByPrimaryKey(bId);
    }
}
