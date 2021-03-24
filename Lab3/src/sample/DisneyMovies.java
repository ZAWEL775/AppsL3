package sample;

import sun.security.util.ByteArrayLexOrder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DisneyMovies {

    /** Variables
     * */
    private static String Name;
    private static ArrayList<Movies> movie;
    private static ArrayList<String> charactersArrayList;
    private static ArrayList<String> movieArrayList;
    private static ArrayList<String> matches = new ArrayList<String>();


    /** Constructor
     * */
    public DisneyMovies(String name) {
    this.Name = name;
    this.movie = new ArrayList<Movies>();
    this.charactersArrayList = new ArrayList<String>();
    this.movieArrayList = new ArrayList<String>();
    }


    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static ArrayList<Movies> getMovies() {
        return movie;
    }

    public static void setMovies(ArrayList<Movies> movies) {
        DisneyMovies.movie = movies;
    }

    public static ArrayList<String> getCharactersArrayList() {
        return charactersArrayList;
    }

    public static void setCharactersArrayList(ArrayList<String> charactersArrayList) {
        DisneyMovies.charactersArrayList = charactersArrayList;
    }

    public static ArrayList<String> getMovieArrayList() {
        return movieArrayList;
    }

    public static void setMovieArrayList(ArrayList<String> movieArrayList) {
        DisneyMovies.movieArrayList = movieArrayList;
    }

    public void loadMovies(String fileName) throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String lineJustFetched = null;
        String[] wordsArray;

        while(true){
            lineJustFetched = buf.readLine();
            if(lineJustFetched == null) {
                break;
            } else {
                wordsArray = lineJustFetched.split("\t");
                wordsArray = lineJustFetched.split(",");
                for(String each : wordsArray){
                    if(!"".equals(each)) {
                        movieArrayList.add(each);
                    }
                }
            }
        } buf.close();

        // TODO Add Movies Object

        for(int i=0; i<movieArrayList.size(); i++){

            if(movieArrayList.get(i).equalsIgnoreCase("Toy Story 04")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("The Lion King")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Frozen 02")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Aladdin")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Dumbo")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Maleficent")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Lady and the Tramp")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Captain Marvel")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            } else if(movieArrayList.get(i).equalsIgnoreCase("Spies in Disguise")){
                Movies movies = new Movies(movieArrayList.get(i), movieArrayList.get(i+1), movieArrayList.get(i+2));
                addMovie(movies);
            }
        }
    }


    public void loadCharacters(String fileName) throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader(fileName));
        String lineJustFetched = null;
        String[] wordsArray;

        while(true){
            lineJustFetched = buf.readLine();
            if(lineJustFetched == null) {
                break;
            } else {
                wordsArray = lineJustFetched.split("\t");
                wordsArray = lineJustFetched.split(",");
                for(String each : wordsArray){
                    if(!"".equals(each)) {
                        charactersArrayList.add(each);
                    }
                }
            }
        } buf.close();

        // TODO  Add characters object

        for(int i=0; i<charactersArrayList.size(); i++){

            if(charactersArrayList.get(i).equalsIgnoreCase("TS04-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(0).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("TLK-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(1).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("F02-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(2).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("A-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(3).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("D-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(4).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("M-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(5).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("LatT-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(6).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("CM-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(7).addCast(cast);
            } else if(charactersArrayList.get(i).equalsIgnoreCase("SiD-2019")){
                Cast cast = new Cast(charactersArrayList.get(i-3), charactersArrayList.get(i-2), charactersArrayList.get(i-1), charactersArrayList.get(i+1));
                movie.get(8).addCast(cast);
            }
        }
    }

    public ArrayList<Movies> getMoviesByName(String movieName){
        // TODO Traverse through movies array object find any matches of string/char
        // TODO Print any matching movie object with the cast object attacked to it.
        ArrayList<Movies> returnArrayList = new ArrayList<>();
        for(int i =0; i< movie.size(); i++){
           if(movie.get(i).getName().contains(movieName)){
               returnArrayList.add(movie.get(i));
           }
        } return returnArrayList;
    }



    public void addMovie(Movies movies){
        movie.add(movies);
    }

}

