import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] map1 = new int[10][10];
		int[][] map2 = new int[10][10];
		int[][] radar1 = new int[10][10];
		int[][] radar2 = new int[10][10];
		
		for(int i = 0; i < 6; i++) {
			String place = getInput("Place something");
			char[] alph = place.toCharArray();
			int a = alph[1] - '0';
			map1 = shipPlace(map1,letterRead(alph),a);
			radar1 = map1;
			
			
			String decision = getInput("What is your move?");
			alph = decision.toCharArray();
			a = alph[1] - '0';
			
			if(radar1[letterRead(alph)][a] == 1) { // 1 means there is a ship
				radar1[letterRead(alph)][a] = 2; // 2 is hit
				System.out.println("You hit");			
			} else if(radar1[letterRead(alph)][a] == 0) { // 0 means there is no ship
				radar1[letterRead(alph)][a] = 3; // 3 is miss
				System.out.println("You missed");	
			} else if(radar1[letterRead(alph)][a] == 2|| radar1[letterRead(alph)][a] == 3) {
			while(radar1[letterRead(alph)][a] == 2 || radar1[letterRead(alph)][a] == 3) {
					System.out.println("You already tried that");
					decision = getInput("What is your move?");
					alph = decision.toCharArray();
					a = alph[1] - '0';
					}
			if(radar1[letterRead(alph)][a] == 1) { // 1 means there is a ship
				radar1[letterRead(alph)][a] = 2; // 2 is hit
				System.out.println("You hit");			
			} else if(radar1[letterRead(alph)][a] == 0) { // 0 means there is no ship
				radar1[letterRead(alph)][a] = 3; // 3 is miss
				System.out.println("You missed");
					
				}
			}
		}
		}
		
		
		// radar[letterRead(alph)][a]);
		
		
		
		// map2 = shipPlace(map2,letterRead(alph),a);
		
		
		
		
	
	
	
	
	private static int[][] shipPlace(int[][] map, int r, int c) {
		
		map[r][c] = 1;
		
		return map;
	}
	
	private static int letterRead(char[] alph) {
		char[] cols = new char[] {'a','b','c','d','e','f','g','h','i','j'};
		int read = -1;
		for(int i = 0; i < cols.length; i++) {
			if(charRead(alph) == cols[i]) {
				read = i;
			}
		}
		
		return read;
	}
	
	private static char charRead(char[] alph) {
		return alph[0];
	}
	
	private static String getInput(String text) {
		Scanner input = new Scanner(System.in);
		String choice = "";
		try 
		{
			System.out.println(text);
			choice = input.nextLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return choice;
	}

}
