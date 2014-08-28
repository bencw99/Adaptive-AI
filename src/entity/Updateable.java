package entity;

/**
 * An interface representing an updateable entity 
 * 
 * @author Benjamin Cohen-Wang
 */
public interface Updateable 
{
	/**
	 * Updates this updateable instance
	 * 
	 * @param updateTime	the time since last instance
	 */
	public abstract void update(double updateTime);
}
