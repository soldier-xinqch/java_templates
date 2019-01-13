package com.xinqch.mybatismanydatasourcetemplate.data.service;


import com.xinqch.mybatismanydatasourcetemplate.data.entity.TestTab;

/**
 * <p>
 * 测试表 服务类
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
public interface TestTabService  {

    public TestTab getById(String id);

    public TestTab getByIdSlave(String id);

}
