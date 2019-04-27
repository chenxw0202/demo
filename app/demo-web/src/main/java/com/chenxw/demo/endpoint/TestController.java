package com.chenxw.demo.endpoint;

import com.chenxw.demo.facade.TestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class TestController {
    @Autowired
    private TestFacade testFacade;

    @RequestMapping("test")
    public String test(){
        System.out.println("这是一个rest测试接口");
        return testFacade.getTest();

    }


}
