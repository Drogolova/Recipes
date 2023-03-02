package me.drogolova.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {

    @GetMapping("/")
    public String appLaunched() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "1. Дроголова Надежда " + "\n" +
                "2. Recipes" + "\n" +
                "3. 2.03.2023" + "\n" +
                "4. Web-проект";
    }
}
