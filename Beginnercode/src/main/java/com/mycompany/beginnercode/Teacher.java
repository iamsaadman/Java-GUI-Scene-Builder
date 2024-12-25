/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beginnercode;



public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(String n, String m,int ph){  //Constructor
        name =n;
        gender =m;
        phone =ph;
        
    }
    /*void setInformation(String n,String m, int ph){  //Parametrized Method
        
        name = n;
        gender = m;
        phone = ph;
        
        
    }*/
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("phone : "+phone);
        
    }
    
}


