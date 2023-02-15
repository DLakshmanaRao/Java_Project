package lp.cj.movie;


import java.util.List;

public class MovieRatingUser {

    public static void main(String[] args) throws Exception {

        MovieService movieService = new MovieService();
        String movie_id = "5";
        List<Rating> rating = movieService.getMoviesOf(movie_id);
        System.out.println(rating);
        System.out.println('\n' + '\n' + '\n');

        List<MovieDTO> list = movieService.getAvgRatting();
        for (MovieDTO movie : list) {
            System.out.println(String.format("Movie id = %s  ----  Movie Name = '%s'   ----    Average Rating = %s --------Count of reviewers = %s", movie.getMovie_id(), movie.getName(), movie.getAvg_ratting(),(int) movie.getCount()));
            System.out.println("\n");
        }

    }
}

