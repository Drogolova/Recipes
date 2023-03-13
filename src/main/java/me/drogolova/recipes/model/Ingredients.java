package me.drogolova.recipes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredients {
    private String title;
    private int amount;
    private String measureUnit;
}
