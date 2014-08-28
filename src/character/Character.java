package character;

import java.awt.*;

import entity.*;

/**
 * A class representing a character
 * 
 * @author Benjamin Cohen-Wang
 */
public abstract class Character extends Active
{
	/** An enum for the various types of moves a character can perform **/
	public static enum Move {UP, DOWN, SIDE, SPECIAL};
	
	
	
	/**
	 * Draws this drawable instance
	 */
	public void draw(Graphics graphics) 
	{
		
	}
}
