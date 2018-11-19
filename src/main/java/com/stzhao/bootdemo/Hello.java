package com.stzhao.bootdemo;

import com.alibaba.fastjson.JSON;
import com.stzhao.entity.TestPO;
import com.stzhao.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {

    private static Logger logger = LoggerFactory.getLogger(Hello.class);


    @Autowired
    TestService testService;

    @GetMapping("/hello2")
    public String hello() {


    List<TestPO> list = testService.queryAll();

        logger.info("hehehehe");


        return "laoZ2"+JSON.toJSONString(list);




    }
}
