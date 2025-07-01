package ArrayListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {
    /*Favorite Movies List
Create an ArrayList of movie names (Strings).
Add 7 movie names.
Print total number of movies.
Ask the user to enter a movie name to check if it’s in the list.
Print "Found" or "Not Found" accordingly.
Remove the last movie from the list.
Print the updated list.

     */


    public static void main(String[] args) {
        List<String> movieName = new ArrayList<>();
        movieName.addAll(Arrays.asList("Dangal","welcome","Punjab","No entry","Raid2","Sultan","Sardar g 3"));
        System.out.println("total Number of movie -"+movieName.size());

        String searchmovie = movieName.get(0);
        boolean found = false;

        for(String movie : movieName ){
            if (searchmovie==movie){
                found =true;
                searchmovie = movie;
            }
        }
        if(found){
            System.out.println("Movie has been found - "+searchmovie);
        }
        if(!found){
            System.out.println("movie has not find");
        }
        movieName.remove(6);
        System.out.println("movie has been removed and please see below updated list - ");
        System.out.println(movieName);
    }
}
