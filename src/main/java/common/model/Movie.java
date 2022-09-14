package common.model;

import java.util.Objects;

public class Movie {

    private String title;
    private MovieSeries series;

    public Movie(String title, MovieSeries series) {
        this.title = title;
        this.series = series;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieSeries getSeries() {
        return series;
    }

    public void setSeries(MovieSeries series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && series == movie.series;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, series);
    }
}
