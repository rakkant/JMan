import java.awt.Color;
/**
 * 
 * @author Rakkan Tiasakul 5810546013
 * this class inherits from Piece.
 * Using for represent as Block in the board game.
 *
 */
public class Block extends Piece{

	/**
	 * 
	 * @param X set X position
	 * @param Y set Y position
	 * @param m for using Block from map in Piece class
	 */
	public Block(int X, int Y, Map m) {
		super(Piece.BLOCK,m);
		this.setX(X);
		this.setY(Y);
		super.setColor(Color.WHITE);
	}

	/**
	 * Block class doing nothing so return nothing.
	 */
	@Override
	public void act() {
		return ;

	}

	/**
	 * to print out the location of Block.
	 */
	public String toString(){
		return getColorWord() + "Block at (" + getX() +", "+ getY() + ")";
	}

}
