package Lists;

/**
 * Created by sf2016 on 10.04.2017.
 */


public class Movie {
    public Movie(String title, int duration, int boxOffice, int yearOfRelease) {
        this.title = title;
        this.duration = duration;
        this.boxOffice = boxOffice;
        this.yearOfRelease = yearOfRelease;
    }


    private String title;
    private int duration;
    private int boxOffice;
    private int yearOfRelease;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", boxOffice=" + boxOffice +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
