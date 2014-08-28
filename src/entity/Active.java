package entity;

import java.util.ArrayList;

import physics.kinematics.Vector;

/**
 * A class representing entities in the game that are active
 * 
 * @author Benjamin Cohen-Wang
 */
public abstract class Active extends Entity implements Updateable
{
	/** The vector describing the velocity of this active entity **/
	private Vector velocity;
	
	/** The arraylist containing the forces acting on this active entity **/
	private ArrayList<Vector> forces;
	
	/**
	 * Updates this active entity
	 * 
	 * @param updateTime	the time since last instance
	 */
	public void update(double updateTime)
	{
		getPosition().update(velocity, updateTime);
		
	}
}
