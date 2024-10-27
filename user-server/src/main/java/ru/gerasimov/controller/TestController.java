package ru.gerasimov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gerasimov.client.DollClient;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class TestController {

    private final DollClient dollClient;

    @GetMapping("/page")
    public String getPageHello(){
        return "hello";
    }

    @GetMapping("/dolls")
    public String getPageDolls(Model model){
        model.addAttribute("dolls", dollClient.getAllDolls());
        return "list_dolls";
    }

    @GetMapping("/dolls/{dollId}")
    public String getPageDolls(@PathVariable("dollId") int dollId, Model model){
        model.addAttribute("doll", dollClient.getDollById(dollId));
        return "doll";
    }

}
