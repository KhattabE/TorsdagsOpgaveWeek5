import java.util.ArrayList;

class Team{
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerInTeamNames = new ArrayList();


	public Team(String teamName){
		this.teamName = teamName;
	}



	public void setRank(int rankNumber){
		this.teamRank = rankNumber;
	}



	public void addPlayer(String playerName){
		playerInTeamNames.add(playerName);
	}


	@Override
	public String toString() {
    	String result = "Team: " + teamName + ", Ranked in: " + teamRank + " place!\n";

    	for (String player : playerInTeamNames) {
        result += "Player name: " + player + "\n";
    	}

    	return result;
	}


}