package com.test.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("name") String name) {
        return userService.hello(name);
    }
    @RequestMapping("/test")
    @ResponseBody
    public String hello() {
        return "ok";
    }
}
