package ru.gerasimov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class TestController {

    @GetMapping("/dolls")
    public String getTestOne() {
        return "dolls";
    }

    @GetMapping("/tests")
    public String getTestTwo() {
        return "tests";
    }
}
