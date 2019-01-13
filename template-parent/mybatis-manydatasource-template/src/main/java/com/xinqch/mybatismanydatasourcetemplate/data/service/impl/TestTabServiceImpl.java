package com.xinqch.mybatismanydatasourcetemplate.data.service.impl;

import com.xinqch.mybatismanydatasourcetemplate.data.entity.TestTab;
import com.xinqch.mybatismanydatasourcetemplate.data.mapper.TestTabMapper;
import com.xinqch.mybatismanydatasourcetemplate.data.service.TestTabService;
import com.xinqch.mybatismanydatasourcetemplate.database.DataSourceTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试表 服务实现类
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
@Service
public class TestTabServiceImpl implements TestTabService {

    @Autowired
    private TestTabMapper testTabMapper;

    @Override
    public TestTab getById(String id) {
        return testTabMapper.getById(id);
    }

    @Override
    public TestTab getByIdSlave(String id) {
        return testTabMapper.getByIdSlave(id);
    }

}
