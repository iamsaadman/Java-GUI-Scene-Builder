package ArrayList;

import java.util.ArrayList;

public class No3 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        color.add(0,"Orange");
        color.add(1,"Red");

        System.out.println(color);

    }
}