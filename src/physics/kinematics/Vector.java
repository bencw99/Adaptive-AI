package physics.kinematics;

import java.util.*;

/** A class representing a vector
 * 
 * @author Benjamin Cohen-Wang
 */
public class Vector 
{
	/** The x-displacement of the vector */
	private double x;
	
	/** The y-displacement of the vector */
	private double y;
	
	/** Default constructor, initializes vector displacements to (0, 0)
	 * 
	 */
	public Vector()
	{
		x = 0;
		y = 0;
	}
	
	/** Parameterized constructor, initializes vector displacements to given parameters
	 * 
	 * @param x	The x-displacement instance initialized to
	 * @param y	The y-displacement instance initialized to
	 */
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	/** Returns a vector that is this vector added to the given vector
	 * 
	 * @param other	the vector to be added to this vector
	 * @return a version of this instance with the given vector added to it
	 */
	public Vector add(Vector other)
	{
		return new Vector(this.x + other.x, this.y + other.y);
	}
	
	
	
	/**
	 * @return x-displacement of instance
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * @return y-displacement of instance
	 */
	public double getY()
	{
		return y;
	}

	/**
	 * @param x the value the x-displacement is set to
	 */
	public void setX(double x)
	{
		this.x = x;
	}

	/**
	 * @param y the value the y-displacement is set to
	 */
	public void setY(double y)
	{
		this.y = y;
	}
	
	/**
	 * Returns the net vector of the given vector arraylist
	 * 
	 * @param vectors	the array of vectors whose sum is to be found
	 * @return the sum of the given vectors
	 */
	public static Vector getNet(ArrayList<Vector> vectors)
	{
		Vector net = new Vector(0, 0);
		
		for(Vector vector : vectors)
		{
			net = net.add(vector);
		}
		
		return net;
	}
}
