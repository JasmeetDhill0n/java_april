package StringAndArrayAssignment;

public class MovieRating {
   // Movie Rating System You are managing a movie rating system where users rate movies.
    // Write a Java program that: • Stores the names of 5 movies in a string array and stores ratings
    // (out of 5) in another array. • Finds the movie with the highest rating and
    // displays it to the user.

    public static void main(String[] args) {
        String [] movies ={"Dangal","sardaar g 3" ,"punjab","Raid2","Sultan"};
        int [] rating ={2,4,5,1,3};

        for (int i=0;i<5;i++){
            System.out.println("movie - "+movies[i]+"  with their rating -  "+rating[i]);
        }
        int maxRating = rating[0];
        for (int i=0;i<5;i++){
            if(rating[i]>maxRating){
                System.out.println("Movie with highest rating - "+movies[i]);

            }
        }
    }
}
