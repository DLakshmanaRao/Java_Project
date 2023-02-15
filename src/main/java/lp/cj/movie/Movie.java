package lp.cj.movie;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Movie {

    private String movie_id;
    private int year;
    private String name;

}
