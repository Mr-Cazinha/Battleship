
public class Ship {
	int size;
	String name;
	int col;
	int row;
	int hit = 0;
	boolean orientation;
	String letter;
	boolean sunk = false;
	public boolean setup = true;
	
	
	public Ship(int size, String name, String letter) {
		this.size = size;
		this.name = name;
		this.letter = letter;
	}
	
	public Ship(int size, String name) {
		this.size = size;
		this.name = name;
	}
	
	
	// Display "Look"
	

	public void placeShip(Shot loc, boolean or) {
		orientation = or;
		row = loc.getY();
		col = loc.getX();
	}
	
	
	public boolean checkHit(Shot loc) {
		
		//checking each spot to see if we hit.
		
				for(int c = 0; c < size; c++) {
					//deal with orientation
					if(orientation) {
						if(loc.equals(new Shot(col,(row+c)))) {
							hit++;
							return true;
						}
					}else {
						if(loc.equals(new Shot((col+c),row))) {
							hit++;
							return true;
						}
					}
				}
				return false;
			}
	
	public boolean isAlive() {
		if(hit == size) {
			return false;
		}
		return true;
	}
	
	public String[][] renderShip(String[][] field) {
		for(int c = 0; c < size; c++) {
			// deal with orientation
			if(orientation) {
				field[row+c][col] = letter;
			}
			else {
				field[row][col+c] = letter;
			}
		}
		
		return field;
	}
	
}
