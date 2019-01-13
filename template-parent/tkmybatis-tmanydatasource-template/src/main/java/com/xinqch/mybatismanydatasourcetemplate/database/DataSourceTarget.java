package com.xinqch.mybatismanydatasourcetemplate.database;

import java.lang.annotation.*;

/**
 * 指定使用那个数据源
 *
 * @author xinqch
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSourceTarget {

    String value() default "master";
}
