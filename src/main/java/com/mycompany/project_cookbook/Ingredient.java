/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_cookbook;
import java.util.Scanner;
import java.lang.Integer;

/**
 * @date 8/18/2022
 * @author Charlie H.
 * @license Apache 2.0
 */

public class Ingredient {
    private String ingredientName;
    private String unitMeasurement;
    private float ingredientAmount;
    private int numberOfCaloriesPerCup;
    private double totalCalories;
    
    // Default Constructor
    public Ingredient() {
        ingredientName = "";
        ingredientAmount = 0;
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
    
    public String getUnitMeasurement() {
        return unitMeasurement;
    }
    
    public void setUnitMeasurement(String unit) {
        unitMeasurement = unit;
    }
    
    public float getIngredientAmount() {
        return ingredientAmount;
    }
    
    public void setIngredientAmount(float amount) {
        ingredientAmount = amount;
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
    public void setTotalCalories(double totCalories) {
        totalCalories = totCalories;
    }
    
    // Add Ingredient, for esatablishing new ingredients.
    public Ingredient addIngredient(String name) {
        Scanner userInput = new Scanner(System.in);
        Ingredient newIngredient = new Ingredient();
        newIngredient.setIngredientName(name);
        
        boolean isGoodSelection = false;
        do {
            System.out.println("Please enter the unit of measurement for this ingredient. Please chose from the list below."
                               + "\n Cup\n Tbsp\n Tsp\n Gram\nMake your selection by typing the name as it appears.");
            
            if(userInput.hasNext()) {
                newIngredient.setUnitMeasurement(userInput.next());
                if(!"Cup".equals(newIngredient.getUnitMeasurement()) && !"Tbsp".equals(newIngredient.getUnitMeasurement()) 
                && !"Tsp".equals(newIngredient.getUnitMeasurement()) && !"Gram".equals(newIngredient.getUnitMeasurement())) {
                    System.out.print("Error: unit of measurement not recognized, could this by a typo? Please try again.");
                }
                else {
                    isGoodSelection = true;
                }
            }
        } while(!isGoodSelection);
        
        String tempResponse;
        
        isGoodSelection = false;
        do {
            System.out.println("How many " + newIngredient.getUnitMeasurement() + "(s)?");
            
            if(userInput.hasNext()) {
                tempResponse = userInput.next();
                if(!tempResponse.matches("[+-]?\\d*(\\.\\d+)?")) {
                    System.out.println("Error: amount " + tempResponse + " is not a numerical value. Please try again.");
                }
                else {
                    newIngredient.setIngredientAmount(Float.parseFloat(tempResponse));
                    isGoodSelection = true;
                }
            }
        } while(!isGoodSelection);
        
        isGoodSelection = false;
        do {
            System.out.println("How many calories are in each " + newIngredient.getUnitMeasurement() + "?");
            if(userInput.hasNext()) {
                tempResponse = userInput.next();
                if(!tempResponse.matches("[+-]?\\d*(\\.\\d+)?")) {
                    System.out.println("Error: amount " + tempResponse + " is not a numerical value. Please try again.");
                }
                else {
                   newIngredient.setNumberOfCaloriesPerCup(Integer.parseInt(tempResponse));
                   isGoodSelection = true;
                }
            }
        } while(!isGoodSelection);
        
        newIngredient.setTotalCalories(newIngredient.getNumberOfCaloriesPerCup() * newIngredient.getIngredientAmount());
        
        if(newIngredient.getIngredientAmount() >= 2.0)
            System.out.println(newIngredient.getIngredientName() + " uses " + newIngredient.getIngredientAmount() + newIngredient.getUnitMeasurement() + "s and has " + newIngredient.getTotalCalories() + " calories.");
        else
            System.out.println(newIngredient.getIngredientName() + " uses " + newIngredient.getIngredientAmount() + newIngredient.getUnitMeasurement() + " and has " + newIngredient.getTotalCalories() + " calories.");
        
        userInput.close(); 
        return newIngredient;
    }
}