package com.team.shop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
// 在配置完websocket时,只有加上这个注解才能进行单元测试
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DataSourceTest {

    @Autowired
    DataSource dataSource;
    @Test
    public void test(){
        System.out.println(dataSource);
    }
}
