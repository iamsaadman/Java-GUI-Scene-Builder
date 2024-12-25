package ArrayList;


import java.util.ArrayList;
import java.util.Collections;

public class No9 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

       ArrayList<String> color2 = new ArrayList<>();
       color2.add("Black");
       color2.add("Magenta");
       color2.add("Purple");
       color2.add("Maroon");
       color2.add("Ash");

       Collections.copy(color,color2);
        System.out.println(color);
        System.out.println(color2);

    }
}