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
     * Please complete all of below exercises using Stream API and data from @DataFactory class
     *
     * For data sources please use following methods:
     *
     * book list - getBooks() method
     * movie series list - getMovieSeries() method
     * random words generator - getSomeRandomWords() method
     *
     */
    public static void main(String[] args) {

        // map
        /**
         * Please return a list of book titles from provided book list
         */
        List<String> bookNames = null;

        // flatmap
        /**
         * Please return a list of all available movies from provided movie series list
         */
        List<Movie> availableMovies = null;

        // filter
        /**
         * Please return a list of all books written by J_K_ROWLING from provided book list
         */
        List<Book> booksByJKRowling = null;

        // count
        /**
         * Please return the amount of books written by T_PRATCHETT from provided book list
         */
        long booksByTerryPratchettCount = 0;

        // findFirst - nicer effect with parallel stream
        /**
         * Please find first available STAR_WARS movie from provided movie series list
         */
        Optional<Movie> firstStarWarsMovieOnTheShelf = null;

        // findAny - nicer effect with parallel stream
        /**
         * Please find any book written by A_SAPKOWSKI from provided book list
         */
        Optional<Book> anyBookByASapkowski = null;


        // toList
        /**
         * Please create a list of all movie title from provided movie list
         */
        List<String> movieTitlesList = null;

        // toSet
        /**
         * Please create a set of all authors from provided book list
         */
        Set<Author> bookAuthors = null;

        // toMap
        /**
         * Please create a map of books with author as a key from provided book list
         *
         * !only one book per author is required
         * !if new book is found for the same author it should replace the previous one
         */
        Map<Author, Book> bookOfAnAuthorMap = null;

        // groupingBy
        /**
         * Please create a map of books with author as a key from provided book list
         */
        Map<Author, Set<Book>> booksGroupedByAuthor = null;

        // joining
        /**
         * Please create a string from provided random words generator, using " " (space) as a delimiter
         */
        String totallyRandomSentence = null;

        // forEach - only to display results!
        /**
         * Please display any of the results on the console using forEach() method and a Consumer<T> functional interface
         */
        // code
    }
}
