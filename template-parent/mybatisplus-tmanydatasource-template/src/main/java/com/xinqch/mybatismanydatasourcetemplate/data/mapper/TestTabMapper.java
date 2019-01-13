package com.xinqch.mybatismanydatasourcetemplate.data.mapper;

import com.xinqch.mybatismanydatasourcetemplate.data.entity.TestTab;
import com.xinqch.mybatismanydatasourcetemplate.database.DataSourceTarget;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 测试表 Mapper 接口
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
@DataSourceTarget("slave")
public interface TestTabMapper {

    @DataSourceTarget("slave")
    public TestTab getById(@Param("id") String id);

    @DataSourceTarget("master")
    public TestTab getByIdSlave(@Param("id") String id);

}
