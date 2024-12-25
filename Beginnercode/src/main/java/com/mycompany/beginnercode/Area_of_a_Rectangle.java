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
public class Area_of_a_Rectangle {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        double length,breadth,area;
        
        System.out.print("Enter length: ");
        length = input.nextDouble();
        System.out.print("Enter bredth: ");
        breadth = input.nextDouble();
        
        area = length*breadth;
        
        System.out.println("Area is : "+area);
    }
    
}