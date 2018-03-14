package com.ye.dubbo.statement.dao.conf;

/**
 * Created by wangwei on 2017/10/17.
 */
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * springboot集成mybatis的基本入口
 * 1）创建数据源
 * 2）创建SqlSessionFactory
 */
public class MybatisConfig {
    @Autowired
    private Environment env;

    /**
     * 创建数据源(数据源的名称：方法名可以取为XXXDataSource(),XXX为数据库名称,该名称也就是数据源的名称)
     */
    @Bean
    public DataSource sqlDbStatementDataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.db.temp.user.driverClassName"));
        props.put("url", env.getProperty("jdbc.db.temp.user.url"));
        props.put("username", env.getProperty("jdbc.db.temp.user.username"));
        props.put("password", env.getProperty("jdbc.db.temp.user.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }
}
