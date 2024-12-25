/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problems_for_CT1_OOP;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        double a,b,c;
        
       Scanner input = new Scanner(System.in);
       
       a= input.nextDouble();
       b= input.nextDouble();
       c= input.nextDouble();
       
       double discriminant = b*b - 4*a*c;
       if(discriminant>0){
           double root1 = (-b+Math.sqrt(discriminant))/2*a;
           double root2 = (-b-Math.sqrt(discriminant))/2*a;
           
           System.out.println("Equations have two roots.");
           System.out.println("Root 1: "+root1);
           System.out.println("Root 2: "+root2);
       }
       else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has a repeated real root:");
            System.out.println("Root: " + root);
        }
       else {
            System.out.println("The equation has two complex roots.");
        }
       
    }
    
    
}
