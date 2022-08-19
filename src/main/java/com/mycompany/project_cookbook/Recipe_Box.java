/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_cookbook;
import java.util.ArrayList;
/**
 * @data 8/19/2022
 * @author Charlie H.
 */
public class Recipe_Box {
    private ArrayList<Recipe> listOfRecipes;                    // Stores all Recipe Box recipes.
    
    public ArrayList<Recipe> getListOfRecipes() {               // Accessor for the list of recipes.
        return listOfRecipes;
    }
    
    public void setListOfRecipes(ArrayList<Recipe> recipes) {   // Mutator for the list of recipes.
        listOfRecipes = recipes;
    }
    
    public void Recipe_Box() {                                  // Constructor for the Recipe_Box.
        listOfRecipes = new ArrayList<Recipe>();
    }
    
    public void printAllRecipeDetails(String recipe) {          // Prints Recipe Ingredients, servings etc.
        System.out.println("FIXME: printAllRecipeDetails() - Recipe_Box.java");
    }
    
    public void printAllRecipeNames() {                         // Prints all recipes by name. 
        System.out.println("FIXME: printAllRecipeNames() - Recipe_Box.java");
    }
    
    public void addNewRecipe() {                                // Adds new recipes to recipe box.
        System.out.println("FIXME: addNewRecipe() - Recipe_Box.java");
    }
}
