package entity;

import physics.kinematics.*;
import world.*;

/**
 * An abstract class representing an entity that can interact with other entities
 * 
 * @author Benjamin Cohen-Wang
 */
public abstract class Entity implements Drawable 
{
	/** The world that this entity belong to **/
	private World world;
	
	/** The position of this entity **/
	private Position position;

	public World getWorld() 
	{
		return world;
	}

	public Position getPosition() 
	{
		return position;
	}

	public void setWorld(World world) 
	{
		this.world = world;
	}

	public void setPosition(Position position) 
	{
		this.position = position;
	}
}
