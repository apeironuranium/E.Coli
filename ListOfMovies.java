package Lists;

/**
 * Created by sf2016 on 10.04.2017.
 */
public class ListOfMovies {

    Movie list [] = new Movie [100];

        public ListOfMovies(){

    }

    public void add(Movie m){
        for (int i = 0; i<100; i++){
            if (list[i] == null){
                list [i] = m;
                break;
            }
        }


    }
    /*удаляет n-ый элемент из списка*/
    Movie remove(int n){
        Movie tmp = list[n];
        list [n] = null;
        return tmp;
    }
    public void printAllMovies(){
        for (int i = 0; i<100; i++){
            System.out.println(""+list[i]);
        }
    }
}
