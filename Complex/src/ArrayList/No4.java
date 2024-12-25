package ArrayList;


import java.util.ArrayList;

public class No4 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        String element = color.get(0);
        System.out.println(element);
        System.out.println(color);



    }
}