package com.chenxw.demo.facade.impl;

import com.chenxw.demo.facade.TestFacade;
import com.chenxw.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestFacadeImpl implements TestFacade {
    @Autowired
    private TestService testService;

    public String getTest() {
        return testService.getTest();
    }
}
