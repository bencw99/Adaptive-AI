package entity;

import java.awt.*;

/**
 * An interface representing a drawable entity
 * 
 * @author Benjamin Cohen-Wang
 */
public interface Drawable 
{
	/**
	 * Draws this drawable instance
	 */
	public abstract void draw(Graphics graphics);
}
