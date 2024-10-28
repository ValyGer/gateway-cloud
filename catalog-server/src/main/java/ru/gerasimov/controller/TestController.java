package ru.gerasimov.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gerasimov.entity.Doll;
import ru.gerasimov.service.DollService;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class TestController {

    private final DollService dollService;

    @PostMapping("/dolls")
    public ResponseEntity<Doll> createDoll(@RequestBody Doll doll) {
        return ResponseEntity.ok().body(dollService.createDoll(doll));
    }

    @DeleteMapping("/delete/{dollId}")
    public void deleteDoll(@PathVariable int dollId) {
        dollService.deletedoll(dollId);
    }

    @GetMapping("/dolls/{dollId}")
    public ResponseEntity<Doll> getDollById(@PathVariable int dollId) {
        return ResponseEntity.ok().body(dollService.findDollById(dollId));
    }

    @GetMapping("/dolls")
    public ResponseEntity<List<Doll>> getAllDolls() {
        return ResponseEntity.ok().body(dollService.findAllDolls());
    }
}
