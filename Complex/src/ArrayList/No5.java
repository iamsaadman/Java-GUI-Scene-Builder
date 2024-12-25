package ArrayList;

import java.util.ArrayList;

public class No5 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        color.set(0,"Magenta");
        System.out.println(color);



    }
}
