/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_cookbook;

/**
 * @date 8/18/2022
 * @author Charlie H.
 * @license Apache 2.0
 */

public class Ingredient {
    private String ingredientName;
    private float numberOfCups;
    private int numberOfCaloriesPerCup;
    private double totalCalories;
    
    // Default Constructor
    public Ingredient() {
        ingredientName = "";
        numberOfCups = 0;
        numberOfCaloriesPerCup = 0;
        totalCalories = 0;
    }
    
    // Return the name of the current ingredient.
    public String getIngredientName() {
        return ingredientName;
    }
    
    // Set the name of the current ingredient.
    public void setIngredientName(String name) {
        ingredientName = name;
    }
    
    /* Get the number of cups, and this just return a float
    *  therefore, it is important this is addressed later.
    *  FIXME: Maybe make it a double, which could be calculated
    *  as a method later?
    */
    public float getNumberOfCups() {
        return numberOfCups;
    }
    
    /* Set the number of cups.
    *  @see getNumberOfCups()
    */
    public void setNumberOfCups(float cups) {
        numberOfCups = cups;
    }
    
    // Get number of calories per cup.
    public int getNumberOfCaloriesPerCup() {
        return numberOfCaloriesPerCup;
    }
    
    // Set the number of calories per cup.
    public void setNumberOfCaloriesPerCup(int calories) {
        numberOfCaloriesPerCup = calories;
    }
    
    // Get the total amount of calories.
    public double getTotalCalories() {
        return totalCalories;
    }
    
    // Set the total amount of calories.
    public void setTotalCalories(int totCalories) {
        totalCalories = totCalories;
    }
    
    // Add Ingredient, for esatablishing new ingredients.
    public Ingredient addIngredient(String name) {
        Ingredient newIngredient = new Ingredient();
        newIngredient.ingredientName = "";
        return newIngredient;
    }
}