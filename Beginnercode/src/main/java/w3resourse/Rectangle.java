/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3resourse;


public class Rectangle {
    double width;
    double height;
   
   public Rectangle(double width,double height){
       this.width = width;
       this.height = height;
   }
   
   public double getWidth(){
       return width;
   }
   public double getHeight(){
    return height;
   }
   public double getArea(){
       return width * height;
   }
   public double getPerimeter(){
       return 2*(width+height);
   }
   
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7,12);
        System.out.println("Area: "+r1.getArea()+" Perimeter: "+r1.getPerimeter());
    }
   
}
