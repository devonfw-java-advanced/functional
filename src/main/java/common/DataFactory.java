package common;

import common.model.Author;
import common.model.Book;
import common.model.Movie;
import common.model.MovieSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DataFactory {

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Lord of the Rings", Author.J_R_R_TOLKIEN));
        books.add(new Book("Harry Potter and the Philosopher's Stone", Author.J_K_ROWLING));
        books.add(new Book("Harry Potter and the Chamber of Secrets", Author.J_K_ROWLING));
        books.add(new Book("Guards! Guards!", Author.T_PRATCHETT));
        books.add(new Book("Men at Arms", Author.T_PRATCHETT));
        books.add(new Book("Feet of Clay", Author.T_PRATCHETT));
        books.add(new Book("The Last Wish", Author.A_SAPKOWSKI));
        books.add(new Book("Lux Perpetua", Author.A_SAPKOWSKI));
        return books;
    }

    public static List<List<Movie>> getMovieSeries() {
        List<List<Movie>> movieSeries = new ArrayList<>();

        List<Movie> starWarsMovies = new ArrayList<>();
        starWarsMovies.add(new Movie("A New Hope", MovieSeries.STAR_WARS));
        starWarsMovies.add(new Movie("Empire Strikes Back", MovieSeries.STAR_WARS));
        starWarsMovies.add(new Movie("Return of the Jedi", MovieSeries.STAR_WARS));

        List<Movie> indianaJonesMovies = new ArrayList<>();
        indianaJonesMovies.add(new Movie("Raiders of the Lost Ark", MovieSeries.INDIANA_JONES));
        indianaJonesMovies.add(new Movie("Temple of Doom", MovieSeries.INDIANA_JONES));
        indianaJonesMovies.add(new Movie("The Last Crusade", MovieSeries.INDIANA_JONES));

        movieSeries.add(starWarsMovies);
        movieSeries.add(indianaJonesMovies);

        return movieSeries;
    }

    public static List<String> getSomeRandomWords() {
        return Arrays.asList("What", "a", "fun", "workshop", "!");
    }

    public static Optional<String> getOptionalValue() {
        String value = "I'm not empty!";
        return Optional.of(value);
    }

    public static Optional<String> getEmptyOptional() {
        return Optional.empty();
    }

    public static String emptyOptionalInfo() {
        return "Nothing was found here either";
    }

    public static String getSuppliedText() {
        return "I came here to supply you with an example string";
    }
}
