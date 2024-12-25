/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading_Constructor;

public class Student {
 
    static int count = 0;//non static  
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println("Total student: "+count);
    }
}
