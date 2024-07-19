package com.ayulin.myblog.web;

import com.ayulin.myblog.common.domain.dos.UserDO;
import com.ayulin.myblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@SpringBootTest
@Slf4j
public class MyblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /*@Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("ayulin111")
                .password("123456")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }*/

}
