package ru.gerasimov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gerasimov.entity.Doll;

@RestController
@RequestMapping("/user")
public class TestRestController {

    @GetMapping("/doll")
    public Doll getDoll(){
        return new Doll("Barby");
    }
}
