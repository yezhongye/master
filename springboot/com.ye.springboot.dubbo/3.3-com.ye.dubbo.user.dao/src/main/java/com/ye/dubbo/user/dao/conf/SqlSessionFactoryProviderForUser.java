package com.ye.dubbo.user.dao.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by wangwei on 2017/10/17.
 */
@Configuration
public class SqlSessionFactoryProviderForUser {
    @Autowired
    private Environment env;

    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean(name = "UserSqlSessionFactory")
    public SqlSessionFactory userSqlSessionFactory(@Qualifier("sqlDbUserDataSource")DataSource ds) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(ds);//指定数据源(这个必须有，否则报错)
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        fb.setTypeAliasesPackage(env.getProperty("mybatis.temp.user.typeAliasesPackage"));//指定基包
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.temp.user.mapperLocations")));//指定xml文件位置
//        fb.setPlugins(new Interceptor[]{});
        return fb.getObject();
    }
}
