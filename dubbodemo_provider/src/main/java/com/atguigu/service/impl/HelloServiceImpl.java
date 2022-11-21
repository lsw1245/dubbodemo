package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class) //是Dubbo框架提供的注解，用于发布指定的服务到注册中心
@Transactional //生成jdk的动态代理 com.sun.proxy.$Proxy35
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
