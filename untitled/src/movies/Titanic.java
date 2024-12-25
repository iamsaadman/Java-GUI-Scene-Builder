package movies;

import org.w3c.dom.ls.LSOutput;

public class Titanic {
    String directorName , featuredSong;

    Titanic(String directorName,String featuredSong){
        this.directorName = directorName;
        this.featuredSong = featuredSong;
    }

   void showDetails(){
       System.out.println(directorName+" "+featuredSong );
   }

    public static void main(String[] args) {
        System.out.print("Titanic sank in the North Atlantic Ocean on 15 April 1912 after \n" +
                "striking an iceberg.");
        Titanic T = new Titanic("James Cameron","My Heart Will Go On");
        System.out.println();
        T.showDetails();
    }
}
