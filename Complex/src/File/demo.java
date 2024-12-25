package File;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File dir = new File("C:/Users/User/OneDrive/Desktop/person");
        dir.mkdir();//directory will be created
        String dirlocatior = dir.getAbsolutePath();
        System.out.println(dirlocatior);
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName()+ " folder has been deleted");
        }
    }
}
