package me.drogolova.recipes.services;

import me.drogolova.recipes.model.Ingredients;

public interface IngredientsServices {

    void addIngredient(Ingredients ingredient);
    Ingredients getIngredient(Integer integer);
}
