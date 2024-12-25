package ArrayList;

import java.util.ArrayList;

public class No6 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

       color.remove(3);
        System.out.println(color);


    }
}