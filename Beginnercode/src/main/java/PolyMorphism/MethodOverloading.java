/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolyMorphism;


public class MethodOverloading {
    void add(){
        int a =10, b=20,c;
        c=a+b;
        System.out.println(c) ;
    }
    
    void add(int x,int y){
       int c;
        c=x+y;
        System.out.println(c) ;
    }
     void add(int x,double y){
       
         double c;
        c=x+y;
        System.out.println(c) ;
    }
    
     public static void main(String[] args) {
        MethodOverloading r = new MethodOverloading();
        
        r.add();
        r.add(100,200);
        r.add(50,45.32);
        
    }
}
