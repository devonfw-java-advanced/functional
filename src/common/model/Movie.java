package common.model;

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
}
