/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beginnercode;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size= "+number.size());
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println(number);
        System.out.println();
     
        System.out.println("size= "+number.size());
        
        //Removing elements
        number.remove(2);
        System.out.println(number);
        number.removeAll(number);
        System.out.println("After removing all: "+number);
    }
}
