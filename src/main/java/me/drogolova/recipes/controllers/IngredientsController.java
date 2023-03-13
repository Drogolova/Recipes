package me.drogolova.recipes.controllers;

import me.drogolova.recipes.model.Ingredients;
import me.drogolova.recipes.services.IngredientsServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {

    private IngredientsServices ingredientsServices;

    public IngredientsController(IngredientsServices ingredientsServices) {
        this.ingredientsServices = ingredientsServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Ingredients> addIngredient(Ingredients ingredient) {

        ingredientsServices.addIngredient(ingredient);
        return ResponseEntity.ok(ingredient);
    }

    @GetMapping("/getIngredient")
    public ResponseEntity<Ingredients> getIngredient(Integer integer) {

        return ResponseEntity.ok(ingredientsServices.getIngredient(integer));
    }
}
