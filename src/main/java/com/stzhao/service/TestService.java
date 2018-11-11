package com.stzhao.service;

import com.stzhao.dao.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TestService implements TestMapper {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List queryAll() {
        return testMapper.queryAll();
    }
}
