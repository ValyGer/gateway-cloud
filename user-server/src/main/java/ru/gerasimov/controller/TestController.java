package ru.gerasimov.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gerasimov.client.DollClient;
import ru.gerasimov.model.Doll;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final DollClient dollClient;

    @GetMapping("/page")
    public String getPageHello(){
        log.info("Get page hello");
        return "hello";
    }

    @GetMapping("/create")
    public String getCreateDollPage(){
        log.info("Get page edit_doll");
        return "edit_doll";
    }

    @PostMapping("/create")
    public String createDoll(Doll doll){
        log.info("Created new doll!");
        return "redirect:http://localhost/user/dolls/%d".formatted(this.dollClient.createDoll(doll).getDollId());
    }

    @GetMapping("/dolls")
    public String getPageDolls(Model model){
        model.addAttribute("dolls", dollClient.getAllDolls());
        log.info("Get page list_dolls");
        return "list_dolls";
    }

    @GetMapping("/dolls/{dollId}")
    public String getPageDolls(@PathVariable("dollId") int dollId, Model model){
        model.addAttribute("doll", dollClient.getDollById(dollId));
        log.info("Get page list_dolls");
        return "doll";
    }

    @GetMapping("/delete")
    public String getDeleteDollPage(){
        log.info("Get page del_doll");
        return "del_doll";
    }

    @PostMapping("/delete")
    public String deleteDoll(Integer dollId) {
        dollClient.deleteDoll(dollId);
        log.info("Delete doll");
        return "redirect:http://127.0.0.1/user/dolls";
    }
}
