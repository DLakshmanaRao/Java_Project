package lp.cj.Cources;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class CourceDTO {
    public String cource_id;
    public String student_id;
    public String trainer_id;
    public String Cname;
    public String Tname;
    public String Sname;
    public double fee;

    public int Scount;
    public int Ccount;


}

