package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/10/29 14:29
 */
@RestController
public class HelloController {
    @GetMapping("/haha")
    public String hello() {
        return "Hello";
    }
}
