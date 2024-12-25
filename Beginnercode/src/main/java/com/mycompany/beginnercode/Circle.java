/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beginnercode;

/**
 *
 * @author User
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
  
    public Circle(double radius){
    this.radius = radius;
}
    public double getarea(){
        return Math.PI * radius * radius;
    }
    public double getradius(){
        return radius;
    }
    
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(12.0);
        Circle c3 = new Circle(24.0);
        
        System.out.println("Circle 1 Radius: "+c1.getradius() + "  Area : "+c1.getarea());
        System.out.println("Circle 2 Radius: "+c2.getradius() + "  Area : "+c2.getarea());
        System.out.println("Circle 3 Radius: "+c3.getradius() + "  Area : "+c3.getarea());
    }
}
