/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problems_for_CT1_OOP;

/**
 *
 * @author User
 */
public class Student { 
    private String name;
    private int roll_no;

    public Student() {
        name = "";
        roll_no = 0;
    }

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setRollNo(2);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}
