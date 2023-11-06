import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] map = new int[10][10];
		int[][] radar = new int[10][10];
		String decision = getInput("What is your move?");
		char[] alph = decision.toCharArray();
		int a = alph[1] - '0';
		System.out.print(letterRead(alph));
		System.out.println(a);
		
		System.out.println(radar[letterRead(alph)][a]);
		
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
