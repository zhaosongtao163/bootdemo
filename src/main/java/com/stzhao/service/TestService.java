package com.stzhao.service;

import com.stzhao.dao.test.TestMapper;
import com.stzhao.entity.TestPO;
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
    public List<TestPO> queryAll() {
        return testMapper.queryAll();
    }
}
