package exercises;

import common.model.Author;
import common.model.Book;
import common.model.Movie;
import common.model.MovieSeries;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static common.DataFactory.*;

public class Streams {

    /**
     * Solution 2a: Please return a list of book titles from provided book list.
     */
    public List<String> bookNames() {
        List<String> bookNames =
                getBooks().stream()
                        .map(Book::getTitle)
                        .collect(Collectors.toList());
        return bookNames;
    }

    /**
     * Solution 2b: Please return a list of all available movies from provided movie series list.
     */
    public List<Movie> availableMovies() {
        List<Movie> availableMovies =
                getMovieSeries().stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());
        return availableMovies;
    }

    /**
     * Solution 2c: Please return a list of all books written by J_K_ROWLING from provided book list.
     */
    public List<Book> booksByJKRowling() {
        List<Book> booksByJKRowling =
                getBooks().stream()
                        .filter(book -> book.getAuthor() == Author.J_K_ROWLING)
                        .collect(Collectors.toList());
        return booksByJKRowling;
    }

    /**
     * Solution 2d: Please return the amount of books written by T_PRATCHETT from provided book list.
     */
    public long countBooksByTerryPratchett() {
        long booksByTerryPratchettCount =
                getBooks().stream()
                        .filter(book -> book.getAuthor() == Author.T_PRATCHETT)
                        .count();
        return booksByTerryPratchettCount;
    }

    /**
     * Solution 2e: Please find first available STAR_WARS movie from provided movie series list
     */
    public Optional<Movie> findFirstStarWarsMovieOnTheShelf() {
        Optional<Movie> firstStarWarsMovieOnTheShelf =
                getMovieSeries()
                        .parallelStream()
                        .flatMap(Collection::stream)
                        .filter(movie -> movie.getSeries() == MovieSeries.STAR_WARS)
                        .findFirst();
        return firstStarWarsMovieOnTheShelf;
    }

    /**
     * Solution 2f: Please find any book written by A_SAPKOWSKI from provided book list
     */
    public Optional<Book> findAnyBookByASapkowski() {
        Optional<Book> findAnyBookByASapkowski =
                getBooks().parallelStream()
                        .filter(book -> book.getAuthor() == Author.A_SAPKOWSKI)
                        .findAny();
        return findAnyBookByASapkowski;
    }

    /**
     * Solution 2g: Please create a list of all movie title from provided movie list
     */
    public List<String> movieTitlesList() {
        List<String> movieList =
                getMovieSeries().stream()
                        .flatMap(Collection::stream)
                        .map(Movie::getTitle)
                        .collect(Collectors.toList());
        return movieList;
    }

    /**
     * Solution 2h: Please create a set of all authors from provided book list
     */
    public Set<Author> bookAuthors() {
        Set<Author> bookAuthors =
                getBooks().stream()
                        .map(Book::getAuthor)
                        .collect(Collectors.toSet());
        return bookAuthors;
    }

    /**
     * Solution 2i: Please create a map of books with author as a key from provided book list
     *
     * !only one book per author is required
     */
    public Map<Author, Book> bookOfAnAuthorMap() {
        Map<Author, Book> booksByAuthorMap =
                getBooks().stream()
                        .collect(Collectors.toMap(Book::getAuthor, Function.identity(),
                                (existing, replacement) -> existing));
        return booksByAuthorMap;
    }

    /**
     * Solution 2j: Please create a map of books with author as a key from provided book list
     */
    public Map<Author, Set<Book>> booksGroupedByAuthor() {
        Map<Author, Set<Book>> booksGroupedByAuthor =
                getBooks().stream()
                        .collect(Collectors.groupingBy(Book::getAuthor, Collectors.toSet()));
        return booksGroupedByAuthor;
    }


    /**
     * Exercise 2k: Please create a string from provided random words generator, using " " (space) as a delimiter
     */
    public String totallyRandomSentenceJoined() {
        String sentence =
                getSomeRandomWords().stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(" "));
        return sentence;
    }

}
