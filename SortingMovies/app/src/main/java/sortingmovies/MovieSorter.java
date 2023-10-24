package SortingMovies.app.src.main.java.sortingmovies;

import java.util.Comparator;

public class MovieSorter {

    private Comparator<Movie> sortByRecentYear = (a, b) -> b.year - a.year;

    private Comparator<Movie> sortByTitleIgnoringPrefix = (a, b) ->
            removePrefix(a.title).compareToIgnoreCase(removePrefix(b.title));

    private String removePrefix(String title) {
        return title.replaceAll("^(A|An|The)\\s", "");
    }

    public Comparator<Movie> getSortByRecentYear() {
        return sortByRecentYear;
    }

    public Comparator<Movie> getSortByTitleIgnoringPrefix() {
        return sortByTitleIgnoringPrefix;
    }

    public void printMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.title + " (" + movie.year + ")");
        }
    }
}
