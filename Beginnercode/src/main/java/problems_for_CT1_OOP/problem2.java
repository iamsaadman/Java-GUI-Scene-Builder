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

public class problem2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b,c;
    
        System.out.print("Enter 1st number: ");
       a= input.nextInt();
       System.out.print("Enter 2nd number: ");
       b= input.nextInt();
       System.out.print("Enter 3rd number: ");
       c= input.nextInt();
        
       if(a>b && a>c){
           System.out.println("Greatest is : "+a);
       }
       
       
       else if(b>c && b>a){
           System.out.println("Greatest is : "+b);
       }
  
       else if(c>a&& c>b){
           System.out.println("Greatest is : "+c);
       }
    
       else{
           System.out.println("Numbers are equal.");
       }
        
        
    }
}
