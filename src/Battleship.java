import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battleship {
	
		public static void main(String[] args) {	
			
			boolean[][] map1 = new boolean [10][10];
			boolean[][] map2 = new boolean [10][10];
			
			askForPlacement("Player 1");
			askForPlacement("Player 2");
			
		}
		
		
		private static int letterRead(char letter) {
			char[] cols = new char[] {'#','a','b','c','d','e','f','g','h','i','j'};
			
			int a = 0;
			for(int i = 0; i < cols.length; i++) {
				if(letter == cols[i]) {
					a = i;
				}
			}
			return a;
		}
		
		private static void askForPlacement(String player) {
			Ship[] shim = new Ship[5];
			int i = 0;
			for(Ship ship : ships()) {
				String a = getInput(player + ", where do you want to place " + ship.name + "(letter|number)");
				char letter = getShipLetter(a);
				int number = getShipNumber(a);
				shim[i] = new Ship(ship.dots, ship.name,number,letterRead(letter));
				shim[i].canPlaceShip(direc(getInput("What direction do you want to place, Horizontal[0], Vertical[1]")));
				i++;
			}
		}
		
		private static int direc(String result) {
			return Integer.parseInt(result);
		}
		
		
		private static char[] location(String a) {
			char[] n = a.toCharArray();
			return n;
		}
		
		private static char getShipLetter(String result) {
			
			char a = location(result)[0];	
			return a;
		}
		
		private static int getShipNumber(String result) {
			int a = location(result)[1] - '0';	
			return a;
		}

		private static Ship[] ships() {
			return new Ship[] {new Ship(5, "Carrier(5)"), new Ship(4, "Battleship(4)"), new Ship(3, "Cruiser(3)"), new Ship(3, "Submarine(3)"), new Ship(2, "Destroyer(2)")};
		}
		
		
		private static String getInput(String text) {
			Scanner input;
			String choice;
			try 
			{
				input = new Scanner(System.in);
				System.out.println(text);
				choice = input.nextLine();
			}catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
			return choice;
	}

		private static boolean isInputInteger(String input) {
			boolean isAnInteger = true;
			for(int c = 0; c < input.length();c++) {
				char letter = input.charAt(c);
				//'-' is 45 '0 - 9' 48 - 57
				if(c!=0 &&!(letter >= 48 && letter<= 57))
				{
					isAnInteger = false;
				}else if(letter != 45 && !(letter >= 48 && letter <= 57))
				{
					isAnInteger = false;
				}
			}
			return isAnInteger;
		}
		
}	

