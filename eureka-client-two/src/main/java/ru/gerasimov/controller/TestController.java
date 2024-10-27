package ru.gerasimov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/page")
    public String getPageHello(){
        return "hello";
    }
}
