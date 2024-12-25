package ArrayList;

import java.util.ArrayList;

public class NO7 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>();
        color.add("Red");
        color.add("Orange");
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        if(color.contains("Red")){
                  System.out.println("Found");
             }
        else
              System.out.println("Not Found");

    }
}