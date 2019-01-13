package com.xinqch.mybatismanydatasourcetemplate;

import com.xinqch.mybatismanydatasourcetemplate.data.entity.TestTab;
import com.xinqch.mybatismanydatasourcetemplate.data.service.TestTabService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisManydatasourceTemplateApplicationTests {

    @Autowired
    private TestTabService testTabService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testService(){
        TestTab t = testTabService.getById("1");
        System.out.println("#################" + t.getMessage());
        TestTab s = testTabService.getByIdSlave("1");
        System.out.println("#################" + s.getMessage());
    }
}

