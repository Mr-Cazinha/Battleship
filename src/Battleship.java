import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battleship {
	
		public static void main(String[] args) {	
			
			int[][] map1 = new int [10][10];
			int[][] map2 = new int [10][10];
			
			askForPlacement("Player 1");
			askForPlacement("Player 2");
			
		}
		
		private static void askForPlacement(String player) {
			for(String ship : ships()) {
				String letter = getShipLetter(player, ship);
				int number = getShipNumber(player, ship);
				
			}
		}
		
		private static String getShipLetter(String player, String ship) {
			String input = getInput(player + ", on what letter do you want to place " + ship);
			if(!letters().contains(input.toUpperCase())) {
				System.out.println("Please enter a letter between A and J");
				return getShipLetter(player, ship);
			}
			return input;
		}
		
		private static int getShipNumber(String player, String ship) {
			String input = getInput(player + ", on what number do you want to place " + ship);
			if(!isInputInteger(input)) {
				System.out.println("Please enter a number between 1 and 10.");
				return getShipNumber(player, ship);
			}
			int number = Integer.parseInt(input);
			if(number < 1 || number > 10 ) {
				System.out.println("Please enter a number between 1 and 10.");
				return getShipNumber(player, ship);
			}
			
			return number;
		}

		private static String[] ships() {
			return new String[] {"Carrier(5)", "Battleship(4)", "Cruiser(3)", "Submarine(3)", "Destroyer(2)"};
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
		
		private static List<String> letters() {
			List letters = new ArrayList<>();
			letters.add("A");
			letters.add("B");
			letters.add("C");
			letters.add("D");
			letters.add("E");
			letters.add("F");
			letters.add("G");
			letters.add("H");
			letters.add("I");
			letters.add("J");
			
			return letters;
		}
		
}	

