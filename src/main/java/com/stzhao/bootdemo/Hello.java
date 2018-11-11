package com.stzhao.bootdemo;

import com.stzhao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {

    @Autowired
    TestService testService;

    @GetMapping("/hello2")
    public String hello() {


    List list = testService.queryAll();


        return "laoZ2";




    }
}
