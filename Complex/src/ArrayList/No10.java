package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class No10 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        Collections.shuffle(color);
        System.out.println(color);

    }
}