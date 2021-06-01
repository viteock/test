package aHomework;

public class MovieInfo {
    public static void main(String[] args) {
        String movieName = "Run Vasea run!!";
        String movieGenre = "Horror";
        int movieDuration = 2;
        short releaseDate1 = 07;
        double releaseDate2 = 24.2021;
        char movieRating = 'G';
        boolean isSequels = false;
        byte rottenRating = 99;
        boolean isOnDvd = true;

        System.out.println("\t------ Welcome to the Cinema ------");
        System.out.println("\tTonigh we are streaming " + movieName  +
                " which was released on " + releaseDate1 + "." + releaseDate2);
        System.out.println("\tThis " + movieGenre + " movie got a " + rottenRating +
                " rating on Rotten Tomatoes.");
        System.out.println("\tThe rating is " + movieRating + " and it runs for " +
               movieDuration + " hours." );
        System.out.println("\tThis is sequel " + isSequels + " and is on DVD " +
                isOnDvd);

    }
}
