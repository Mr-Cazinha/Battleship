import java.util.Scanner;

public class Battleship {
	
		public static void main(String[] args) {	
			String start = getInput("Where fo you want to place your ");
			
			
			
		}
		private static String[] ships() {
		String[] ship = new String[] {"Carrier(5), Battleship(4), Cruiser(3), Submarine(3), Destroyer(2)"};
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
	}
