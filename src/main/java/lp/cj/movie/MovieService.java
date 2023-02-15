package lp.cj.movie;


import lombok.ToString;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
@ToString

public class MovieService {

    private List<Movie> movies;
    private List<Rating> ratings;

    public MovieService() throws Exception {
        movies = this.loadMovies();
        ratings = this.loadRatings();
    }


    public List<Rating> getRatings() {
        return this.ratings;
    }

    private Rating getRating(String movie_id){
        for (Rating rating : ratings){
            if(rating.getMovie_id().equalsIgnoreCase(movie_id)){
                return rating;
            }
        }
        return  null;
    }

    public List<Rating> getMoviesOf(String movie_id) {
        List<Rating> list = this.getRatings();
        List<Rating> ratingList = new ArrayList<>();
        for (Rating ratings : list) {
            if (ratings.getMovie_id().equalsIgnoreCase(movie_id)) {
                ratingList.add(ratings);
            }
        }
        return ratingList;

    }


    public List<MovieDTO> getAvgRatting(){
        List<MovieDTO> list = new ArrayList<>();

        for (Movie movie: movies){
            List<Rating> rating = getMoviesOf(movie.getMovie_id());
            String movie_id = movie.getMovie_id();
            String name = movie.getName();
            float sum = 0;
            float count = 0;
            float avg_rating = 0;
            for (Rating rat:rating) {
                sum = sum + Integer. valueOf(rat.getRatting());
                count += 1;
                avg_rating = sum/count;
            }
            MovieDTO movieDTO = new MovieDTO(movie_id, name, avg_rating, count);
            list.add(movieDTO);
        }
        return list;
    }


    // Load movie file
    private List<Movie> loadMovies() {
        List<Movie> movieList = new ArrayList<>();
        try {
            Path path = new File(MovieService.class.getResource("/movie_data.csv").toURI()).toPath();
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i <= lines.size(); i++) {
                String[] movieData = lines.get(i).split(",");
                String movie_id = movieData[0];
                String year = movieData[1];
                String name = movieData[2];
                Movie movies = Movie.builder()
                        .year(Integer.parseInt(year))
                        .movie_id(movie_id)
                        .name(name)
                        .build();
                movieList.add(movies);
            }
        } catch(Exception e ){
            System.out.println(e);

        }
        return movieList;
    }


    //load ratting file
    private List<Rating> loadRatings() {
        List<Rating> ratingList = new ArrayList<>();
        try {
            Path path = new File(MovieService.class.getResource("/rating.csv").toURI()).toPath();
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i <= lines.size(); i++) {
                String[] ratingData = lines.get(i).split(",");
                String user_id = ratingData[0];
                String ratting = ratingData[1];
                String movie_id = ratingData[2];
                Rating ratings = Rating.builder()
                        .user_id(user_id)
                        .movie_id(movie_id)
                        .ratting(Integer.parseInt(ratting))
                        .build();
                ratingList.add(ratings);
            }
        } catch(Exception e ){
            System.out.println(e);

        }
        return ratingList;
    }


}

