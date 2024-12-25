/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beginnercode;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        double celsius,fahrenheit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = 0.55 * fahrenheit -32;
        
        System.out.println("In celsius: "+celsius);
    }
    
}
