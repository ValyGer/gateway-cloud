package ru.gerasimov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gerasimov.client.DollClient;
import ru.gerasimov.model.Doll;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class TestController {

    private final DollClient dollClient;

    @GetMapping("/page")
    public String getPageHello(){
        return "hello";
    }

    @GetMapping("/create")
    public String getCreateDollPage(){
        return "edit_doll";
    }

    @PostMapping("/create")
    public String createDoll(Doll doll){
        return "redirect:/user/dolls/%d".formatted(this.dollClient.createDoll(doll).getDollId());
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

    @GetMapping("/delete")
    public String getDeleteDollPage(){
        return "del_doll";
    }

    @PostMapping("/delete")
    public String deleteDoll(int dollId) {
        dollClient.deleteDoll(dollId);
        return "redirect:/user/dolls";
    }


}
