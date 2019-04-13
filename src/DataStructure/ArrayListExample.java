package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> movies_2014 = new ArrayList<String>();
        movies_2014.add("A Most Violent Year");
        movies_2014.add("Gone Girl");
        movies_2014.add("Interstellar");
        movies_2014.add("Dawn of the Planet of the Apes");
        movies_2014.add("The Grand Budapest Hotel");
        movies_2014.add("Godzilla");
        movies_2014.add("Birdman");
        movies_2014.add("Fury");
        movies_2014.add("Nightcrawler");
        movies_2014.add("Whiplash");
        movies_2014.add("American Sniper");
        movies_2014.add("The Imitation Game");
        movies_2014.add("The Theory of Everything");
        movies_2014.add("Foxcatcher");
        movies_2014.add("The Equalizer");
        movies_2014.add("The Raid 2");
        movies_2014.add("The Wolf of Wall Street");
        movies_2014.add("Her");
        movies_2014.add("Locke");
        movies_2014.add("Rush");
        movies_2014.add("Snowpiercer");
        movies_2014.add("The Judge");
        movies_2014.add("X-Men: Days of Future Past");
        /*for(int i=0; i<movies_2014.size(); i++ ){
            System.out.println(movies_2014.get(i));
        }*/
        Collections.sort(movies_2014); //Sorts list by alphabetical order
        for (String i : movies_2014){
            System.out.println(i);
        }
    }
}
