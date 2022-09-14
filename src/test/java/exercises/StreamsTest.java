package exercises;

import common.model.Author;
import common.model.Book;
import common.model.Movie;
import common.model.MovieSeries;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static exercises.TestTools.failMsg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamsTest {

    private Streams exercises = new Streams();

    @Test
    @DisplayName("Exercise 2a: book names list")
    public void bookNames() {
        // when
        List<String> bookNames = exercises.bookNames();
        // then
        Assertions.assertThat(bookNames)
                .describedAs("2a")
                .containsExactly("Lord of the Rings",
                        "Harry Potter and the Philosopher's Stone",
                        "Harry Potter and the Chamber of Secrets",
                        "Guards! Guards!",
                        "Men at Arms",
                        "Feet of Clay",
                        "The Last Wish",
                        "Lux Perpetua");
    }

    @Test
    @DisplayName("Exercise 2b: available movies list")
    public void availableMovies() {
        // when
        List<Movie> movies = exercises.availableMovies();
        // then
        Assertions.assertThat(movies)
                .describedAs("2b")
                .containsExactly(new Movie("A New Hope", MovieSeries.STAR_WARS),
                        new Movie("Empire Strikes Back", MovieSeries.STAR_WARS),
                        new Movie("Return of the Jedi", MovieSeries.STAR_WARS),
                        new Movie("Raiders of the Lost Ark", MovieSeries.INDIANA_JONES),
                        new Movie("Temple of Doom", MovieSeries.INDIANA_JONES),
                        new Movie("The Last Crusade", MovieSeries.INDIANA_JONES));
    }

    @Test
    @DisplayName("Exercise 2c: filter books by J.K. Rowling")
    public void booksByJKRowling() {
        // when
        List<Book> books = exercises.booksByJKRowling();
        // then
        Assertions.assertThat(books)
                .describedAs("2c")
                .containsExactly(new Book("Harry Potter and the Philosopher's Stone", Author.J_K_ROWLING),
                        new Book("Harry Potter and the Chamber of Secrets", Author.J_K_ROWLING));
    }

    @Test
    @DisplayName("Exercise 2d: count books by T. Pratchett")
    public void countBooksByTerryPratchett() {
        // when
        long count = exercises.countBooksByTerryPratchett();
        // then
        assertEquals(3, count, failMsg("2d"));
    }

    @Test
    @DisplayName("Exercise 2e: find first Star Wars movie")
    public void findFirstStarWarsMovieOnTheShelf() {
        // when
        Optional<Movie> firstStarWarsMovie = exercises.findFirstStarWarsMovieOnTheShelf();
        // then
        assertEquals(Optional.of(new Movie("A New Hope", MovieSeries.STAR_WARS)), firstStarWarsMovie, failMsg("2e"));
    }

    @Test
    @DisplayName("Exercise 2f: find any book by A. Sapkowski")
    public void findAnyBookByASapkowski() {
        // when
        Optional<Book> book = exercises.findAnyBookByASapkowski();
        // then
        assertTrue(book.isPresent());
        assertEquals(Author.A_SAPKOWSKI, book.get().getAuthor());
    }

    @Test
    @DisplayName("Exercise 2g: get all movie titles list")
    public void movieTitlesList() {
        // when
        List<String> movieTitlesList = exercises.movieTitlesList();
        // then
        Assertions.assertThat(movieTitlesList)
                .describedAs("2g")
                .containsExactly("A New Hope",
                        "Empire Strikes Back",
                        "Return of the Jedi",
                        "Raiders of the Lost Ark",
                        "Temple of Doom",
                        "The Last Crusade");
    }

    @Test
    @DisplayName("Exercise 2h: get all book authors")
    public void bookAuthors() {
        // when
        Set<Author> authors = exercises.bookAuthors();
        // then
        Assertions.assertThat(authors)
                .describedAs("2h")
                .contains(Author.J_R_R_TOLKIEN,
                        Author.J_K_ROWLING,
                        Author.T_PRATCHETT,
                        Author.A_SAPKOWSKI);
    }


    @Test
    @DisplayName("Exercise 2i: get any book of each author")
    public void bookOfAnAuthorMap() {
        // when
        Map<Author, Book> authorBookMap = exercises.bookOfAnAuthorMap();
        // then
        assertEquals(4, authorBookMap.size());
        Assertions.assertThat(authorBookMap)
                .describedAs("2i")
                .containsKeys(Author.J_K_ROWLING, Author.T_PRATCHETT, Author.A_SAPKOWSKI, Author.J_R_R_TOLKIEN);
    }

    @Test
    @DisplayName("Exercise 2j: get books grouped by author")
    public void booksGroupedByAuthor() {
        // when
        Map<Author, Set<Book>> booksGroupedByAuthor = exercises.booksGroupedByAuthor();
        // then
        assertEquals(4, booksGroupedByAuthor.size());
        Assertions.assertThat(booksGroupedByAuthor)
                .describedAs("2j")
                .containsKeys(Author.J_K_ROWLING, Author.T_PRATCHETT, Author.A_SAPKOWSKI, Author.J_R_R_TOLKIEN);
        assertEquals(1, booksGroupedByAuthor.get(Author.J_R_R_TOLKIEN).size());
        assertEquals(2, booksGroupedByAuthor.get(Author.J_K_ROWLING).size());
        assertEquals(3, booksGroupedByAuthor.get(Author.T_PRATCHETT).size());
        assertEquals(2, booksGroupedByAuthor.get(Author.A_SAPKOWSKI).size());
    }

    @Test
    @DisplayName("Exercise 2k: get books grouped by author")
    public void totallyRandomSentenceJoined() {
        // when
        String sentenceJoined = exercises.totallyRandomSentenceJoined();
        // then
        assertEquals("WHAT A FUN WORKSHOP !", sentenceJoined);
    }
}
