/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beginnercode;

/**
 *
 * @author User
 */
public class TeacherTest {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Saadman Sakib", "Male", 1952825863);
        
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("Rakib Hossain", "Male", 1711112175);
         
         System.out.println("---------------------");
               
        teacher2.displayInformation();
     
    }
        
}
