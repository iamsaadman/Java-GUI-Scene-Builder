package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class No8 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        System.out.println(color);
        Collections.sort(color);
        System.out.println(color);

    }
}