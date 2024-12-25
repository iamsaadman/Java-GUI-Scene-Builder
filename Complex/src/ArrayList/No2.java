package ArrayList;

import java.util.ArrayList;

public class No2 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        for(String elements: color){
            System.out.println(elements);
        }


    }
}