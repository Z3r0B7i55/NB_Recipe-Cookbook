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
    
    public float getNumberOfCups() {
        return numberOfCups;
    }
    public void setNumberOfCups(float cups) {
        numberOfCups = cups;
    }
    
    public int getNumberOfCaloriesPerCup() {
        return numberOfCaloriesPerCup;
    }
    
    public void setNumberOfCaloriesPerCup(int calories) {
        numberOfCaloriesPerCup = calories;
    }
    
    public double getTotalCalories() {
        return totalCalories;
    }
    
    public void setTotalCalories(int totCalories) {
        totalCalories = totCalories;
    }
    
    public Ingredient addIngredient(String name) {
        Ingredient newIngredient = new Ingredient();
        newIngredient.ingredientName = "";
        return newIngredient;
    }
}