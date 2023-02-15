package lp.cj.movie;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Rating {
    private String user_id;
    private int ratting;
    private String movie_id;

}
