package com.xinqch.mybatismanydatasourcetemplate.database;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * AOP切面 实现动态切换数据源逻辑
 *
 * @auther xinch
 * @create 2017/12/20 14:43
 */
@Aspect
// 该切面应当先于 @Transactional 执行
@Order(-1)
@Component
public class DynamicDataSourceAspect {
    public static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Before("@annotation(targetDataSource)")
    public void changeDataSource(JoinPoint point, DataSourceTarget targetDataSource) {
        String dsId = targetDataSource.value();
        if (DynamicDataSourceContextHolder.dataSourceIds.contains(dsId)) {
            logger.info("Use DataSource :{} >", dsId, point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceRouterKey(dsId);
        } else {
            logger.info("数据源[{}]不存在，使用默认数据源 >{}", dsId, point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceRouterKey(dsId);
        }
    }

    @After("@annotation(dataSourceTarget)")
    public void restoreDataSource(JoinPoint point, DataSourceTarget dataSourceTarget) {
        logger.debug("Revert DataSource : " + dataSourceTarget.value() + " > " + point.getSignature());
        DynamicDataSourceContextHolder.removeDataSourceRouterKey();

    }
}
