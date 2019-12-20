package view;

import domain.Movie;

import java.time.LocalDateTime;
import java.util.List;

public class OutputView {
    public static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void printLocalTimes(List<LocalDateTime> localTimes) {
        for (LocalDateTime localTime : localTimes) {
            System.out.println(localTime.toString());
        }
    }
}
