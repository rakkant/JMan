import java.awt.Color;
/**
 * 
 * @author Rakkan Tiasakul 5810546013
 * this class inherits from Piece.
 * Using for represent as Pillar in the board game.
 *
 */
public class Pillar extends Piece {
	
	/**
	 * 
	 * @param X for set X position
	 * @param Y for set Y position
	 * @param c for set color
	 * @param m for using Block from map in Piece class
	 * this is constuctor. 
	 */
	
	public Pillar(int X, int Y,int c, Map m) {
		super(Piece.PILLAR,m);
		this.setX(X);
		this.setY(Y);
		if (c == 0){
			this.setColor(Color.RED);
		}else if(c == 1){
			this.setColor(Color.GREEN);
		}else if (c == 2){
			this.setColor(Color.YELLOW);
		}
	}

	/**
	 * 
	 * @param X : set X position
	 * @param Y : set Y position
	 * @param c : set color
	 * @param m : from map in Piece class
	 */
	public Pillar(int X, int Y, Color c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(X);
		super.setY(Y);
		super.setColor(c);
	}

	/**
	 * 
	 * @param color for set the color 
	 */
	public void setColor (int color){
		setActed(true);
		if (color == 0){
			this.setColor(Color.RED);
		}else if(color == 1){
			this.setColor(Color.GREEN);
		}else if (color == 2){
			this.setColor(Color.YELLOW);
		}
	}


	/**
	 * to change the color that has been set from SetColor();
	 */
	@Override
	public void act() {
		if (Piece.rand(0, 2) > 1){
			setColor(Piece.rand(0, 2));
		}
	}
	
	/**
	 * To print out the location of pillar.
	 */
	public String toString(){
		return getColorWord() + "Pillar at (" + getX() +", "+ getY() + ")";
	}

}
