/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_cookbook;
import java.util.ArrayList;

/**
 * @date 8/18/2022
 * @author Charlie H.
 * @license Apache 2.0
 */
public class Recipe {
    private String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients;
    private double totalRecipeCalories;
    
    public Recipe() {
        recipeName = "";
        servings = 0;
        recipeIngredients = new ArrayList<Ingredient>();
        totalRecipeCalories = 0.0;
    }
    
    public String getRecipeName() {
        return recipeName;
    }
    
    public void setRecipeName(String name) {
        recipeName = name;
    }
    
    public int getServings() {
        return servings;
    }
    
    public void setServings(int serving) {
        servings = serving;
    }
    
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    public void setRecipeIngredients(ArrayList<Ingredient> ingredients) {
        recipeIngredients = ingredients;
    }
    
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
    public void setTotalRecipeCalories(double totCalories) {
        totalRecipeCalories = totCalories;
    }
    
    public void printRecipe() {
        Ingredient curIngredient;
        for(int i = 0; i < recipeIngredients.size(); i++) {
            curIngredient = recipeIngredients.get(i);
            System.out.print(curIngredient.getIngredientName());
            System.out.println(" Cups: " + curIngredient.getNumberOfCups());
        }
        /*
        * FIXME
        * More must be added to this function to calculate calories per
        * serving, or will this value be tallyed up elsewhere?
        */
        System.out.print("FIXME: printRecipe() - Recipe.java");
    }
    
    public Recipe addRecipe(String name) {
        Recipe newRecipe = new Recipe();
        newRecipe.recipeName = "";
        return newRecipe;
    }
}