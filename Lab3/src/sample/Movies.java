package sample;

import java.util.ArrayList;

public class Movies {

    /** Variables
     * */
    private static String Name;
    private static String UID;
    private static String Genre;
    private static ArrayList<Cast> cast;

    /** Constructor
     * */
    public Movies(String name, String uid, String genre){
        this.Name = name;
        this.UID = uid;
        this.Genre = genre;
        this.cast = new ArrayList<Cast>();
    }

    /**@return String
     *
     * */
    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getUID() {
        return UID;
    }

    public static void setUID(String UID) {
        Movies.UID = UID;
    }

    public static String getGenre() {
        return Genre;
    }

    public static void setGenre(String genre) {
        Genre = genre;
    }

    public static ArrayList<Cast> getCast() {
        return cast;
    }

    public static void setCast(ArrayList<Cast> cast) {
        Movies.cast = cast;
    }


    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        // TODO Add toString method for movie object



        return "";
    }



    public void addCast(Cast casts){
        cast.add(casts);
    }
}
