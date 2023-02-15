package lp.cj.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class MovieDTO {
    private String movie_id;

    public String name;
    public float avg_ratting;
    public float count = 0.0F;
}