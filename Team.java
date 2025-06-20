import java.util.List;

public class Team {
    private int code;
    private List<Player> playerList;

    public Team(){
        this.code = 0;
        this.playerList = null;
    }

    public void addPlayer(Player player){
        this.playerList.add(player);
    }
}
