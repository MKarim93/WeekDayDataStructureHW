package DataStructure;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<MovieDetails> list = new LinkedList<MovieDetails>();

        MovieDetails movie1 = new MovieDetails("A Quiet Place", "John Krasinski", 2018);
        MovieDetails movie2 = new MovieDetails("Sorry To Bother You", "Boots Riley", 2018);
        MovieDetails movie3 = new MovieDetails("Widows", "Steve McQueen", 2018);
        MovieDetails movie4 = new MovieDetails("Searching", "Aneesh Chaganty", 2018);
        MovieDetails movie5 = new MovieDetails("Game Night", "John Francis Daley & Jonathan Goldstein", 2018);
        MovieDetails movie6 = new MovieDetails("Get Out", "Jordan Peele", 2017 );
        MovieDetails movie7 = new MovieDetails("Logan", "James Mangold", 2017);

        list.add(movie1);
        list.add(movie4);
        list.add(movie6);

        for(MovieDetails m:list){
            System.out.println(m.title+", by "+m.director+", released "+m.releaseYear);
        }


    }
}
