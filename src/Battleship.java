import java.util.Scanner;

public class Battleship {
	
		public static void main(String[] args) {	
			
			int[][] map1 = new int [10][10];
			int[][] map2 = new int [10][10];
			
			askForPlacement("Player 1");
			System.out.println("☆ Now flip screen for player 2 ☆");
			askForPlacement("Player 2");
			
		}
		
		private static void askForPlacement(String player) {
			for(String ship : ships()) {
				String input = getInput(player + ", where do you want to place " + ship);
				if(!isInputInteger(input)) {
					
				}
				
			}
		}
		
		private static String[] ships() {
			String[] ship = new String[] {"Carrier(5)", "Battleship(4)", "Cruiser(3)", "Submarine(3)", "Destroyer(2)",};
			return ship;
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

