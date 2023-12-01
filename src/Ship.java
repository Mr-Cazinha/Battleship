
public class Ship {
	int row,col;
	boolean orientation; //true = vert
	int size;
	String letter,name;
	
	public Ship(int s, String n, String l) {
		size = s;
		name = n;
		letter = l;
	}
	
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
					return true;
				}
			}else {
				if(loc.equals(new Shot((col+c),row))) {
					return true;
				}
			}
		}
		return false;
	}
	public String[][] renderShip(String[][] field){
		for(int c = 0; c < size; c++) {
			//deal with orientation
			if(orientation) {
				field[col+c][row] = letter;
			}else {
				field[col][row+c] = " "+letter;
			}
		}
		
		return field;
	}
}
