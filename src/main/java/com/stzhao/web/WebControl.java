package com.stzhao.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebControl {

    @GetMapping("/hello")
    public String hello() {
        return "laoZ1234";
    }
}
