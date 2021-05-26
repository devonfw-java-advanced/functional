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

    public static void main(String[] args) {

        // map
        List<String> bookNames =
                getBooks().stream()
                        .map(Book::getTitle)
                        .collect(Collectors.toList());

        // flatmap
        List<Movie> availableMovies =
                getMovieSeries().stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        // filter
        List<Book> booksByJKRowling =
                getBooks().stream()
                        .filter(book -> book.getAuthor() == Author.J_K_ROWLING)
                        .collect(Collectors.toList());

        // count
        long booksByTerryPratchettCount =
                getBooks().stream()
                .filter(book -> book.getAuthor() == Author.T_PRATCHETT)
                .count();

        // findFirst - nicer effect with parallel stream
        Optional<Movie> firstStarWarsMovieOnTheShelf =
                getMovieSeries().parallelStream()
                        .flatMap(Collection::stream)
                        .filter(movie -> movie.getSeries() == MovieSeries.STAR_WARS)
                        .findFirst();

        // findAny - nicer effect with parallel stream
        Optional<Book> findAnyBookByASapkowski =
                getBooks().parallelStream()
                        .filter(book -> book.getAuthor() == Author.A_SAPKOWSKI)
                        .findAny();


        // toList
        List<String> movieList =
                getMovieSeries().stream()
                        .flatMap(Collection::stream)
                        .map(Movie::getTitle)
                        .collect(Collectors.toList());

        // toSet
        Set<Author> bookAuthors =
                getBooks().stream()
                        .map(Book::getAuthor)
                        .collect(Collectors.toSet());

        // toMap
        Map<Author, Book> booksByAuthorMap =
                getBooks().stream()
                        .collect(Collectors.toMap(Book::getAuthor, Function.identity(),
                                (Book existing, Book replacement) -> existing));

        // groupingBy
        Map<Author, Set<Book>> booksGroupedByAuthor =
                getBooks().stream()
                        .collect(Collectors.groupingBy(Book::getAuthor, Collectors.toSet()));

        // joining
        String totallyRandomSentence =
                getSomeRandomWords().stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(" "));

        // forEach - only to display results!
//        availableMovies.forEach(movie -> System.out.println(movie.getTitle()));
    }
}
