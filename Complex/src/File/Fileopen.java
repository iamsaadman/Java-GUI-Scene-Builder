package File;

import java.io.File;

public class Fileopen {
    public static void main(String[] args) {
        File dir = new File("person");

        String path = dir.getAbsolutePath();

        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");



        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }
        file2.delete();

        if(file2.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File does not exists");
        }
    }
}