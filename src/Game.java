import java.util.Random;
import java.util.Scanner;

public class Game {
	public void run() {
		Player[] players = new Player();
		players[0] = new Player();
		players[1] = new Player();
		players[0].setOpfor(players[1]);
		players[1].setOpfor(players[0]);

		
		int turn;
		Random start = new Random();
		// TODO: place the ship code here
		
		turn = start.nextInt(16);
		
		
		while(players[0].stillAlive() && players[1].stillAlive) {
			clearScreen();
			System.out.println("Player :" + (turn%2 + 1)+" turn");
			waitHere();
			players[turn%2].playTurn();
			waitHere();
			turn++;
		}
		if(players[0].stillAlive()) {
			System.out.println("Player 1 Wins!!!");
		} else {
			System.out.println("Player 2 Wins!!!");
		}
	}
	
	
	private void clearScreen() {
		for(int c = 0; c < 1000; c++) {
			System.out.println("");
		}
		System.out.flush();
	}
	
	private void waitHere() {
		Scanner wait = new Scanner(System.in);
		System.out.println("Press Enter when ready");
		try {
			wait.nextLine();
		} catch(Exception e) {
			
		}
	}
}


// For Player class
/*
 * debug code here
 * 
 * Ship ac = new Ship(5, "Aircraft Carrier", "A");
 * Ship battle = new Ship(4, "Battle Ship", "B");
 * Ship cruiser = new Ship(3, "Cruiser", "C");
 * Ship submarine = new Ship(3, "Submarine", "S");
 * Ship des = new Ship(2, "Destroyer", "D");
 * ac.placeShip(new Shot(0,0), true);
 * battle.placeShip(new Shot(4,3), false);
 * cruiser.placeShip(new Shot(6,6), false);
 * submarine.placeShip(new Shot(4,1), true);
 * des.placeShip(new Shot(7,2), false);
 * deployedShips.add(ac);
 * deployedShips.add(battle);
 * deployedShips.add(cruiser);
 * deployedShips.add(submarine);
 * deployedShips.add(des);
 * 
 * 
 * Remove renderocean and display board
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/