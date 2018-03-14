package com.ye.dubbo.statement.service.bf;

import com.alibaba.dubbo.config.annotation.Service;
import com.ye.db.employee.entity.statement.TbBfOrderFile;
import com.ye.dubbo.statement.dao.dao.TbBfOrderFileDao;
import com.ye.dubbo.statement.service.inf.bf.BfOrderFileService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zjx on 2018/3/13.
 */
@Service
public class BfOrderFileServiceImpl implements BfOrderFileService {

    @Autowired
    TbBfOrderFileDao tbBfOrderFileDao;

    @Override
    public int insertSelective(TbBfOrderFile record) {
        return tbBfOrderFileDao.insertSelective(record);
    }

    @Override
    public TbBfOrderFile selectByPrimaryKey(String bId) {
        return tbBfOrderFileDao.selectByPrimaryKey(bId);
    }
}
