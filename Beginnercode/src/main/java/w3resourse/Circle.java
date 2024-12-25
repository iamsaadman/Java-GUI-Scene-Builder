/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3resourse;

/**
 *
 * @author User
 */
 class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    public double getradius(){
        return radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
     public static void main(String[] args) {
         Circle c1 = new Circle(5);
         System.out.println("Area: "+c1.area()+" Circumference: "+c1.circumference());
     }
    
}
 