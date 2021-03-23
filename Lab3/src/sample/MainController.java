package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class MainController implements Initializable , EventHandler<ActionEvent> {

    /**variables for FXML components and DisneyMovie Class call
     * */
    @FXML private static Button isShow;
    @FXML private static Button Exit;
    @FXML private static TextField isMovieName;
    @FXML private static TextField MovieResults;

    private static ArrayList<Movies> movies;
    private static ArrayList<String> characters;

    static DisneyMovies disneyMovies = new DisneyMovies("Lol");


    // TODO add Javadocs for methods
    public static Button getIsShow() {
        return isShow;
    }

    public static void setIsShow(Button isShow) {
        MainController.isShow = isShow;
    }

    public static Button getExit() {
        return Exit;
    }

    public static void setExit(Button exit) {
        Exit = exit;
    }

    public static TextField getIsMovieName() {
        return isMovieName;
    }

    public static void setIsMovieName(TextField isMovieName) {
        MainController.isMovieName = isMovieName;
    }

    public static TextField getMovieResults() {
        return MovieResults;
    }

    public static void setMovieResults(TextField movieResults) {
        MovieResults = movieResults;
    }

    public static ArrayList<Movies> getMovies() {
        return movies;
    }

    public static void setMovies(ArrayList<Movies> movies) {
        MainController.movies = movies;
    }

    public static ArrayList<String> getCharacters() {
        return characters;
    }

    public static void setCharacters(ArrayList<String> characters) {
        MainController.characters = characters;
    }

    public static DisneyMovies getDisneyMovies() {
        return disneyMovies;
    }

    public static void setDisneyMovies(DisneyMovies disneyMovies) {
        MainController.disneyMovies = disneyMovies;
    }

    public void Exit(ActionEvent event){ System.exit(1); }


    @Override
    public void handle(ActionEvent event) {
        try {
            DisneyMovies disneyMovies = new DisneyMovies(isMovieName.toString());
            disneyMovies.loadCharacters("data/characters.csv");
            disneyMovies.loadMovies("data/movies.csv");
            movies = disneyMovies.getMoviesByName(isMovieName.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
