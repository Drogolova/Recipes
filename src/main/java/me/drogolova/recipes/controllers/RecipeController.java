package me.drogolova.recipes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.drogolova.recipes.model.Recipes;
import me.drogolova.recipes.services.RecipesServices;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private RecipesServices recipesServices;

    public RecipeController(RecipesServices recipesServices) {
        this.recipesServices = recipesServices;
    }

    @PostMapping ("/add")
    public ResponseEntity<Recipes> addRecipe(Recipes recipe) {
        recipesServices.addRecipe(recipe);
        return ResponseEntity.ok(recipe);
    }

    @GetMapping("/get")
    public ResponseEntity<Recipes> recipes(Integer integer) {
        return ResponseEntity.ok(recipesServices.getRecipe(integer)) ;
    }
}
