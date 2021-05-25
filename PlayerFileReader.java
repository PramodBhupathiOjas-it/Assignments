package java22May;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Player {
	String playerName;
	String country;
	int totalruns;
	int hidghestScore;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTotalruns() {
		return totalruns;
	}

	public void setTotalruns(int totalruns) {
		this.totalruns = totalruns;
	}

	public double getHidghestScore() {
		return hidghestScore;
	}

	public void setHidghestScore(int hidghestScore) {
		this.hidghestScore = hidghestScore;
	}

	public Player(String playerName, String country, int totalruns, int hidghestScore) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.totalruns = totalruns;
		this.hidghestScore = hidghestScore;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", country=" + country + ", totalruns=" + totalruns
				+ ", hidghestScore=" + hidghestScore + "]";
	}

}



public class PlayerFileReader {

	static List<Player> playerList = new ArrayList<Player>();

	public static List<Player> getPlayerList() {
		return playerList;
	}

	public static void setPlayerList(List<Player> playerList) {
		PlayerFileReader.playerList = playerList;
	}

	public static void getPlayerFileList() {

		for (Player p : playerList) {
			System.out.println(p);
		}

	}

	public static void readPlayerDetails(String filename) throws IOException {

		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		String line = null;
		while ((line = br.readLine()) != null) {

			String[] splitLine = line.split(";");
			String playerName = (splitLine[0]);
			String country = splitLine[1];
			int totalRuns = Integer.parseInt(splitLine[2]);
			int highestScore = Integer.parseInt(splitLine[3]);

			playerList.add(new Player(playerName, country, totalRuns, highestScore));

		}

	}

	public static void main(String[] args) throws IOException {
		try {
			readPlayerDetails("D:\\player.txt");
			getPlayerFileList();
		} catch (FileReadException e) {
			System.out.println(e);
		}
	}

}