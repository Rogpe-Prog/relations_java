package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team {

	private String name;
	private Date dateCreation;
	
	//associations
	private Coach coach;
	private List<Player> player = new ArrayList<>();
	
	public Team() {
	}

	public Team(String name, Date dateCreation, Coach coach) {
		this.name = name;
		this.dateCreation = dateCreation;
		this.coach = coach;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public List<Player> getPlayer() {
		return player;
	}
	
	public void addPlayer(Player players) {
		player.add(players);
	}

	public void removePlayer(Player players) {
		player.remove(players);
	}

	@Override
	public String toString() {
		return "Team: " + name + "\n" + 
				"Creation: " + dateCreation + "\n" + 
				coach + "\n" + 
				"Players: \n" 
				+ player;
	}
	
	
	
	
}
