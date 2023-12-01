
import java.util.ArrayList;

public class Player {
	String[][] ocean = new String[10][10];
	String[][] radar = new String [10][10];
	//ClassName<dType> ourName = new ClassName<dType>();
	ArrayList<Ship> deployedShips = new ArrayList<Ship>();
	ArrayList<Shot> myShots = new ArrayList<Shot>();
	ArrayList<Shot> opShots = new ArrayList<Shot>();
	
	public Player() {
		init();
		Shot s = new Shot(3,0);
		s.resolve(false);
		//adding to a collection
		myShots.add(s);
		
		opShots.add(s);
		Ship battle = new Ship(4,"BattleShip","B");
		battle.placeShip(new Shot(4,3), false);
		deployedShips.add(battle);
		renderOcean();
		displayBoard(ocean);
	}	
	private void init() {
		initBoard(radar);
		initBoard(ocean);
	}
	private void initBoard(String[][] board) {
		for(int y = 0; y < 10; y++) {
			for(int x = 0; x < 10; x++) {
				board[y][x] = "  ";
			}
		}
		
	}	
	private void renderRadar() {
		//For each loop
		//for(dType yourName : collectionName){}
		for(Shot s : myShots) {
			s.display(radar);
		}
	}	
	private void renderOcean() {
		for(Ship s : deployedShips) {
			s.renderShip(ocean);
		}
		for(Shot s : opShots) {
			s.display(ocean);
		}
	}
	private void displayBoard(String[][] board) {
		// display this board
		char letter = 'A';
		System.out.println("  1 2 3 4 5 6 7 8 9 10");	
		for(int y = 0; y < 10; y++) {
			System.out.print((char)((short)letter+y));
			
			for(int x = 0; x < 10; x++) {
				System.out.print(board[y][x]);
			}
			System.out.print("\n");
		}
	}
}
