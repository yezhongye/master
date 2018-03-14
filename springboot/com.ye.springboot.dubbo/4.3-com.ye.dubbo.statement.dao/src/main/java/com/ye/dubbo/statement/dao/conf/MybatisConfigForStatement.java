package com.ye.dubbo.statement.dao.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangwei on 2017/10/30.
 */
@Configuration    //该注解类似于spring配置文件
@MapperScan(basePackages = "com.ye.dubbo.statement.dao.mapper",sqlSessionFactoryRef="StatementSqlSessionFactory")
public class MybatisConfigForStatement extends MybatisConfig {
}
