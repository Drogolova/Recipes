package me.drogolova.recipes.model;

import lombok.Getter;
import lombok.Setter;
import me.drogolova.recipes.model.Ingredients;

import java.util.ArrayList;
@Getter
@Setter
public class Recipes {
    private String title;
    private int cookingTime;
    private ArrayList<Ingredients> ingredients;
    private ArrayList<String> cookingSteps;

}
