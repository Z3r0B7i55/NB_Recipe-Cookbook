/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_cookbook;
import java.util.ArrayList;
/**
 *
 * @author Charl
 */
public class Recipe_Box {
    private ArrayList<Recipe> listOfRecipes;
    
    public ArrayList<Recipe> getListOfRecipes() {
        return listOfRecipes;
    }
    
    public void setListOfRecipes(ArrayList<Recipe> recipes) {
        listOfRecipes = recipes;
    }
    
    public void Recipe_Box() {
        listOfRecipes = new ArrayList<Recipe>();
    }
    
    public void printAllRecipeDetails(String recipe) {
        System.out.println("FIXME: printAllRecipeDetails() - Recipe_Box.java");
    }
    
    public void printAllRecipeNames() {
        System.out.println("FIXME: printAllRecipeNames() - Recipe_Box.java");
    }
    
    public void addNewRecipe() {
        System.out.println("FIXME: addNewRecipe() - Recipe_Box.java");
    }
}
