/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author User
 */
class A{
    int a,b,c;
    void add(){
        a = 10;
        b=20;
        c=a+b;
        System.out.println("Sum of two numbers: "+c);
    }
    void sub(){
        a=200;
        b=100;
        c=a-b;
        System.out.println("Sub of two Numbers: "+c);
             
    }
}
class B extends A{
    void multi(){
        a=10;
        b=20;
        c=a*b;
        System.out.println("Multiplication of two Numbers: "+c);
    }
    void div(){
        a=10;
        b=20;
        c=a/b;
        System.out.println("Division of two Numbers: "+c);
    }    
}
class C extends B//sub2 
{
    void rem()
    {
        a=10;
        b=3;
        c=a%b;
          System.out.println("Reminder of two Numbers: "+c);

    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();   
        r.rem();
        
    }
}
