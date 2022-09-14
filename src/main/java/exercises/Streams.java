package exercises;

import common.model.Author;
import common.model.Book;
import common.model.Movie;
import common.model.MovieSeries;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static common.DataFactory.*;

/**
 * Please complete all of below exercises using Stream API and data from @DataFactory class
 *
 * For data sources please use following methods:
 *
 * book list - getBooks() method
 * movie series list - getMovieSeries() method
 * random words generator - getSomeRandomWords() method
 *
 */
public class Streams {

    /**
     * Exercise 2a: Please return a list of book titles from provided book list
     */
    public List<String> bookNames() {
        // TODO: implement by map()
        return null;
    }

    /**
     * Example 2b: Please return a list of all available movies from provided movie series list.
     */
    public List<Movie> availableMovies() {
        // TODO: implement by flatMap()
        return null;
    }

    /**
     * Example 2c: Please return a list of all books written by J_K_ROWLING from provided book list.
     */
    public List<Book> booksByJKRowling() {
        // TODO: implement by filter()
        return null;
    }

    /**
     * Exercise 2d: Please return the amount of books written by T_PRATCHETT from provided book list.
     */
    public long countBooksByTerryPratchett() {
        // TODO: implement using count()
        return 0;
    }

    /**
     * Exercise 2e: Please find first available STAR_WARS movie from provided movie series list
     */
    public Optional<Movie> findFirstStarWarsMovieOnTheShelf() {
        // TODO: impelement by findFirst()
        return Optional.empty();
    }

    /**
     * Exercise 2f: Please find any book written by A_SAPKOWSKI from provided book list
     */
    public Optional<Book> findAnyBookByASapkowski() {
        // TODO: implement by findAny()
        return Optional.empty();
    }

    /**
     * Exercise 2g: Please create a list of all movie title from provided movie list
     */
    public List<String> movieTitlesList() {
        // TODO: implement using toList()
        return null;
    }

    /**
     * Exercise 2h: Please create a set of all authors from provided book list
     */
    public Set<Author> bookAuthors() {
        // TODO: implement using toSet()
        return null;
    }

    /**
     * Exercise 2i: Please create a map of books with author as a key from provided book list
     *
     * !only one book per author is required
     * !if new book is found for the same author it should replace the previous one
     */
    public Map<Author, Book> bookOfAnAuthorMap() {
        // TODO: implement using toMap()
        return null;
    }

    /**
     * Exercise 2j: Please create a map of books with author as a key from provided book list
     */
    public Map<Author, Set<Book>> booksGroupedByAuthor() {
        // TODO: implement by groupingBy()
        return null;
    }

    /**
     * Exercise 2k: Please create a string from provided random words generator, using " " (space) as a delimiter
     */
    public String totallyRandomSentenceJoined() {
        // TODO: implement by joining()
        return null;
    }

}
