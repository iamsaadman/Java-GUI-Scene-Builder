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
public class Area_of_a_Triangle {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        double base,height,area;
        
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        
        area = 0.5*base*height;
        
        System.out.println("Area is : "+area);
    }
    
}
