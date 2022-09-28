package entities;

import entities.enums.Position;

public class Player {
	
	private String name;
	private int qtyGoal;
	
	//associations
	private Position position;

	public Player() {
	}

	public Player(String name, int qtyGoal, Position position) {
		this.name = name;
		this.qtyGoal = qtyGoal;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtyGoal() {
		return qtyGoal;
	}

	public void setQtyGoal(int qtyGoal) {
		this.qtyGoal = qtyGoal;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return name  + "\n" 
				+ "Quantity goals: " 
				+ qtyGoal + "\n" + 
				"position: " + position;
	}	
	
	
}
