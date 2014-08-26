package entity;

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
}
