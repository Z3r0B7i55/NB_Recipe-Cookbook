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
    
    // Default Constructor
    public Recipe() {
        recipeName = "";
        servings = 0;
        recipeIngredients = new ArrayList<Ingredient>();
        totalRecipeCalories = 0.0;
    }
    
    // Get Recipe Name
    public String getRecipeName() {
        return recipeName;
    }
    
    // Set the Recipe Name
    public void setRecipeName(String name) {
        recipeName = name;
    }
    
    // Get total servings per recipe.
    public int getServings() {
        return servings;
    }
    
    // Set total servings per recipe.
    public void setServings(int serving) {
        servings = serving;
    }
    
    // Get recipe ingredients from a list.
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    // Set recipe ingredients for a list.
    public void setRecipeIngredients(ArrayList<Ingredient> ingredients) {
        recipeIngredients = ingredients;
    }
    
    // Get total recipe calories.
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
    // Set total recipe calories. 
    public void setTotalRecipeCalories(double totCalories) {
        totalRecipeCalories = totCalories;
    }
    
    // Print out each ingredient, cups per ingredient etc.
    public void printRecipe() {
        Ingredient curIngredient;                               // Declare a variable to store data from loop.
        for(int i = 0; i < recipeIngredients.size(); i++) {     // Run loops based on the size of the list.
            curIngredient = recipeIngredients.get(i);           // Assign the current ingredient to current.
            System.out.print(curIngredient.getIngredientName());// Finally, print it all out.
            System.out.println(" Cups: " + curIngredient.getNumberOfCups());
        }
        /*
        * FIXME
        * More must be added to this function to calculate calories per
        * serving, or will this value be tallyed up elsewhere?
        */
        System.out.print("FIXME: printRecipe() - Recipe.java");
    }
    
    // Add Recipe, for esatablishing new recipes.
    public Recipe addRecipe(String name) {
        Recipe newRecipe = new Recipe();
        newRecipe.recipeName = "";
        return newRecipe;
    }
}