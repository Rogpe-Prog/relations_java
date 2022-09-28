package application;

import java.util.Date;
import java.util.Scanner;

import entities.Coach;
import entities.Player;
import entities.Team;
import entities.enums.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name's Team: ");
		String nameTeam = sc.nextLine();
		System.out.print("Enter date creation Team (dd/MM/yyy): ");
		sc.nextLine();
		
		System.out.print("Enter name's Coach: ");
		String nameCoach = sc.nextLine();
		System.out.print("Enter Salary Coach: ");
		Double salaryCouch = sc.nextDouble();
		
		Coach coach = new Coach(nameCoach, salaryCouch); // create a Coach
		
		Team team = new Team(nameTeam, new Date(), coach); // create a Team with a Coach
		
		System.out.println();
		System.out.println("Enter data Players: ");
		System.out.print("What positions? ");
		Position position = Position.valueOf(sc.next());
		
		System.out.print("How many Players: ");
		int np = sc.nextInt();
		//sc.nextLine();
		for (int i = 0; i < np; i++) {
			System.out.print("Enter name player: ");
			String namePlayer = sc.nextLine();
			sc.nextLine();
			System.out.print("How many gols:");
			int goal = sc.nextInt();
			Player players = new Player(namePlayer, goal, position);
			
			team.addPlayer(players);
			
		}
		
		System.out.println();
		System.out.println(team);
		
		
		
		
		sc.close();
	}

}
