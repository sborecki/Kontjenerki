package com.sebik.multimodule.frontend.web;

import com.sebik.multimodule.backend.business.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebController {
    private final HelloService helloService;

    @Autowired
    public HelloWebController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String get() {
        return helloService.sayHello();
    }
}
