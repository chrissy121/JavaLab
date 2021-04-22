package OfficeHours.Practice_03_02_2021;
/*
Create a class Movie
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd.
 */
public class Movie {
    public static void main(String[] args){

        // Declare variable
        String name = "Forest Gump";
        String genre = "classic";
        byte duration = 2;
        String releaseDate = "Jul 6,1994";
        String rating = "PG-13";
        int rottenTomatoesRating = 70;
        boolean sequels= false;
        boolean isOnDvd= true;

        System.out.println("-------- Welcome to the Cinema-----------");
        System.out.println("");
        System.out.println("Tonight we are streaming \"" + name + "\" which was released on "+ releaseDate);
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes." );
        System.out.println("The rating is " + rating + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " + sequels + " and is on dvd " + isOnDvd);

    }
}
