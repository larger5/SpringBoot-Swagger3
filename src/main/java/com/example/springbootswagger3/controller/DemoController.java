package com.example.springbootswagger3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HTTP测试接口
 *
 * @author hongcunlin
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
