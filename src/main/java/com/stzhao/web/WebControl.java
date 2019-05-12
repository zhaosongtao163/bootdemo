package com.stzhao.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stzhao.bootdemo.Hello;

@RestController
public class WebControl {
	
	private static Logger log = LoggerFactory.getLogger(WebControl.class);
	
    @GetMapping("/hello")
    public String hello() {
    	log.info("start");
        return "laoZ1234";
    }
}
