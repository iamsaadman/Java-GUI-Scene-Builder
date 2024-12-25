package spring21;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {
    String name;
    double imdbRating;
    public Movie(String name, double imdbRating){
        this.name=name;
        this.imdbRating=imdbRating;
    }
    @Override
    public int compareTo(Movie o) {
        if(this.imdbRating<o.imdbRating) return 1;
        else if(this.imdbRating>o.imdbRating) return -1;
        return 0;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Movie> L = new ArrayList<>();
     L.add(new Movie("Inception",8.6));
     L.add(new Movie("The Shawshank Redemption",9.1));
     Collections.sort(L);
     for(Movie movie: L){
         System.out.println(movie.toString());
     }


    }
}
