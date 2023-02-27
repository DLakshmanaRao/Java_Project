package json;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.exceptions.CsvValidationException;
import ipl.domain.Player;
import ipl.service.IplServiceUtil;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
class PlayerInfo {
    private String name;
    private String country;
    private Double amount;
}

@Data
class RoleInfo {
    private String name;
    private List<PlayerInfo> players;
}

@Data
class TeamInfo {
    private String name;
    private List<RoleInfo> roles;
}

@Data
class TeamWraper {
    private List<TeamInfo> teamsList;
}

public class JsonWriterUtil {


    public static void main(String[] args) throws CsvValidationException, IOException {
        //Get the players list data from previus ipl-starts files where it used
        List<Player>   players = IplServiceUtil.getPlayers(new File(JsonWriterUtil.class.getResource("/players.csv").getFile()).toPath());
        //System.out.println(players);
        //get team names
        Set<String> teamNames = players.stream().map(ele -> ele.getTeam()).collect(Collectors.toSet());
        // getting object with team names
        Map<String, List<Player>> teamMap = players.stream().collect(Collectors.groupingBy(Player::getTeam));
        List<TeamInfo> teamsList = new ArrayList<>();
        for (String team : teamNames) {
            List<Player> teamPlayers = teamMap.get(team);  // getting players date which related to one by one teams
            Map<String, List<Player>> roleMap = teamPlayers.stream().collect(Collectors.groupingBy(Player::getRole));
            List<RoleInfo> roleInfoList = new ArrayList<>();
            roleMap.forEach((roleName, rolePlayers) -> {
                RoleInfo obj = new RoleInfo();
                obj.setName(roleName);
                List<PlayerInfo> playerInfoList = new ArrayList<>();
                for (Player player : rolePlayers) {
                    PlayerInfo playerObj = new PlayerInfo();
                    playerObj.setName(player.getName());
                    playerObj.setAmount(player.getAmount());
                    playerObj.setCountry(player.getCountry());
                    playerInfoList.add(playerObj);
                }

                obj.setPlayers(playerInfoList);
                roleInfoList.add(obj);
            });
            TeamInfo teamInfo = new TeamInfo();
            teamInfo.setName(team);
            teamInfo.setRoles(roleInfoList);
            teamsList.add(teamInfo);
        }
        TeamWraper teamWraper = new TeamWraper();
        teamWraper.setTeamsList(teamsList);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            objectMapper.writeValue(new File("ipl.json"), teamWraper);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
