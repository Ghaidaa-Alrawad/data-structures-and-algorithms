package SortingMovies.app.src.test.java.sortingmovies;

import SortingMovies.app.src.main.java.sortingmovies.Movie;
import SortingMovies.app.src.main.java.sortingmovies.MovieSorter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSorterTest {

    private MovieSorter movieSorter;
    private Movie[] movies;

    @BeforeEach
    public void setUp() {
        movieSorter = new MovieSorter();
        movies = new Movie[]{
                new Movie("harry potter and the order of the phoenix", 2007),
                new Movie("Rush Hour 2", 2001),
                new Movie("Mulan", 1998),
                new Movie("harry potter and the goblet of fire", 2005)
        };
    }

    @Test
    public void testSortByRecentYear() {
        Arrays.sort(movies, movieSorter.getSortByRecentYear());
        int[] expectedYears = {2007, 2005, 2001, 1998};
        assertSortedYears(expectedYears);
    }

    @Test
    public void testSortByTitleIgnoringPrefix() {
        Arrays.sort(movies, movieSorter.getSortByTitleIgnoringPrefix());
        String[] expectedTitles = {"harry potter and the goblet of fire","harry potter and the order of the phoenix", "Mulan", "Rush Hour 2"};
        assertSortedTitles(expectedTitles);
    }

    private void assertSortedYears(int[] expectedYears) {
        for (int i = 0; i < movies.length; i++) {
            assertEquals(expectedYears[i], movies[i].year);
        }
    }

    private void assertSortedTitles(String[] expectedTitles) {
        for (int i = 0; i < movies.length; i++) {
            assertEquals(expectedTitles[i], movies[i].title);
        }
    }
}
