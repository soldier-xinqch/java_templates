package com.xinqch.mybatismanydatasourcetemplate;

import com.xinqch.mybatismanydatasourcetemplate.database.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@Import(DynamicDataSourceRegister.class)
@MapperScan("com.xinqch.mybatismanydatasourcetemplate.data.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class MybatisManydatasourceTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisManydatasourceTemplateApplication.class, args);
    }

}

