/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3resourse;

/**
 *
 * @author User
 */
public class Dog {
    String name;
    String breed;
    
    public Dog(String name,String breed){
     this.name = name;
     this.breed = breed;
    }
    public String getname(){
        return name;
    } 
     public String getbreed(){
        return breed;
    } 
     public static void main(String[] args) {
        Dog d1 = new Dog("Jack","German Shepherd");
         System.out.println("Name: "+d1.getname()+"  Age: "+d1.getbreed());
            
    }
}
