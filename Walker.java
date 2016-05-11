import java.awt.Color;

/**
 * 
 * @author Rakkan Tiasakul 5810546013
 * this class inherits from Piece.
 * Using for represent as Walker in the board game.
 *
 */
public class Walker extends Piece {
	/**
	 * 
	 * @param X for set X position
	 * @param Y for set Y position
	 * @param c for set color
	 * @param m for using Block from map in Piece class
	 * this is constuctor. 
	 */
	public Walker( int X, int Y,int c, Map m) { 
		super (Piece.WALKER, m);
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
	public Walker (int X, int Y, Color c, Map m){
		super(Piece.WALKER, m);
		this.setX(X);
		super.setY(Y);
		super.setColor(c);
	}

	/**
	 * This method using for using random color and check if the surrounding grid is null or not. If not, move the position.
	 */
	@Override
	public void act() {
		if (Piece.rand(0, 2) == 0){
			int rand = Piece.rand(0,3);
			if (rand == 0 && getMap().pieceAt(getX(), getY()-1) == null && getMap().isInGrid(getX(), getY()-1)){
				getMap().move(getX(), getY(), getX(), getY()-1);
			}else if(rand == 1 && getMap().pieceAt(getX(), getY()+1) == null && getMap().isInGrid(getX(), getY()+1)){
				getMap().move(getX(), getY(), getX(), getY()+1);
			}else if (rand == 2 && getMap().pieceAt(getX()-1, getY()) == null && getMap().isInGrid(getX()-1, getY())){
				getMap().move(getX(), getY(), getX()-1, getY());
			}else{
				getMap().move(getX(), getY(), getX()+1, getY());
			}
		}	 
	}

	/**
	 * To print out the location of walker.
	 */
	public String toString(){
		return getColorWord() + "Walker at (" + getX() +", "+ getY() + ")";
	}

}
