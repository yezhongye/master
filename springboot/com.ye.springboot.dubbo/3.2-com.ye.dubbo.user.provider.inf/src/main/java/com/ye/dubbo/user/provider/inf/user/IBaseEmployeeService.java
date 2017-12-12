package com.ye.dubbo.user.provider.inf.user;

import com.ye.db.employee.entity.user.TbBaseEmployee;

/**
 * Created by zjx on 2017/12/4 0004.
 */
public interface IBaseEmployeeService {

    TbBaseEmployee getNewEmployeeById(String id);
}
