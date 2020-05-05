package com.lesson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 来永明
 * @date 2020/5/4
 * 描述：
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String test01(){
        return "你好世界";
    }
}
