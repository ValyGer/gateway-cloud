package ru.gerasimov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class TestController {

    @GetMapping("/page")
    public String getPageHello(){
        return "hello";
    }
}
