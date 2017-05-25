package com.fruit.service.impl;

import com.fruit.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/5/25.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "Hello Spring and Dubbo!";
    }
}
