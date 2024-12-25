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
public class ArithmaticOperator {
    public static void main(String[]args){
        int num1,num2,result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
         num1 = input.nextInt();
        System.out.print("Enter num2: ");
         num2 = input.nextInt();
       
       
        
        result = num1 + num2;
       
        System.out.println("Sum ="+result);       
         result = num1 - num2;
        System.out.println("Sub ="+result);
        result = num1 * num2;
        System.out.println("Mul ="+result);
        double result2 = (double) num1 / num2;
        System.out.println("Div ="+result2);
        result = num1 % num2;
        System.out.println("Rem ="+result);

    }
    
}
