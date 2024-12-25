package Basic;


import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args) {
        ArrayList<Stud> students = new ArrayList<>();
        students.add(new Stud(1,110,"Rakib"));
        students.add(new Stud(5,111,"Sakib"));
        students.add(new Stud(2,101,"Sumiya"));
        Collections.sort(students);
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).id+" "+students.get(i).roll+" "+students.get(i).name);
        }
    }
}
