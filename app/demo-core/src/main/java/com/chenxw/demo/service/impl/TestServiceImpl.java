package com.chenxw.demo.service.impl;

import com.chenxw.demo.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    public String getTest() {
        return "这是一个测试接口";
    }
}
