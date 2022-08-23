/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
*
 */

package com.mycompany.project_cookbook;

import java.util.Scanner;   
import java.util.ArrayList; 
import java.util.Arrays;  
import java.util.InputMismatchException;

public class Project_Cookbook {
    
    public int runMenu() {
        int callback;
        boolean exit = false;
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList(
        "1) Print All Recipes", "2) Print Recipe Details", "3) Exit"));
        
        do {
            int userSelection = 0;
            menuItems.forEach(itemsList -> {
                System.out.println(itemsList);
            });                                             //Reads Menu to User
            
            try
            {
                userSelection = userInput.nextInt();
            } catch(InputMismatchException e) {
                System.out.print("Error: Please enter a number within the bounds of the menu.");
                return -1;
            } finally {
                if(userSelection == 3) exit = true;
                return -1;
            }
        } while(!exit);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Ingredient newIngredient = new Ingredient();
        Recipe newRecipe = new Recipe();
        
        System.out.println("Type name of ingredient.");
        newIngredient.addIngredient(userInput.nextLine());
    }
}