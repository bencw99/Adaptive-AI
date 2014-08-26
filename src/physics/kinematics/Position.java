package physics.kinematics;

/** A class representing a position
 * 
 * @author Benjamin Cohen-Wang
 */
public class Position
{
	/** The x-coordinate of the position */
	private double x;
	
	/** The y-coordinate of the position */
	private double y;
	
	/** Default constructor, initializes position to coordinates (0, 0)
	 * 
	 */
	public Position()
	{
		x = 0;
		y = 0;
	}
	
	/** Parameterized constructor, initializes position coordinates to given parameters
	 * 
	 * @param x	The x-coordinate instance initialized to
	 * @param y	The y-coordinate instance initialized to
	 */
	public Position(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** Returns a translated instance of this position
	 * 
	 * @param x	the x-coordinate translated by
	 * @param y	the y-coordinate translated by
	 * @return a version of this instance translated by given values for x and y
	 */
	public Position translate(double x, double y)
	{
		return new Position(this.x + x, this.y + y);
	}
	
	/**
	 * @return x-coordinate of instance
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * @return y-coordinate of instance
	 */
	public double getY()
	{
		return y;
	}

	/**
	 * @param x the value the x-coordinate is set to
	 */
	public void setX(double x)
	{
		this.x = x;
	}

	/**
	 * @param y the value the y-coordinate is set to
	 */
	public void setY(double y)
	{
		this.y = y;
	}
}