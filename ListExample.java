package Lists;

import java.util.ArrayList;

/**
 * Created by sf2016 on 10.04.2017.
 */
public class ListExample {
    public static void main (String[] args) {
        ArrayList<Movie> movies2 = new ArrayList();
        Movie m1 = null;
        movies2.add(m1);
        Movie m2 = null;
        movies2.add(m2);
        Movie m3 = null;
        movies2.add(m3);

        for (Movie m: movies2){
            System.out.println(""+m);
        }


            ListOfMovies list = new ListOfMovies();

        m1 = new Movie("Beautiful Mind", 135, 313000000, 2001);
        m2 = new Movie("Matrix", 136, 313000000, 2001);
        m3 = new Movie("Cloud Atlas", 180, 313000000, 2001);
        list.add(m1);
        list.add(m2);
        list.add(m3);

        list.remove(0);
        list.remove(1);
        list.remove(2);

        Movie m4 = new Movie("Ирония судьбы", 180, 313000000, 1970);
        list.add(m4);

        list.printAllMovies();


    }
}
