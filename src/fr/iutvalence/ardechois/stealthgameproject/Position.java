package fr.iutvalence.ardechois.stealthgameproject;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

/**
 * Position of an element.
 * 
 * @author vanbossm
 *
 */
public class Position
{

	/** X coordinate position. */
	private int x;

	/** Y coordinate position. */
	private int y;

	/**
	 * Constructor of Position.
	 * 
	 * @param x
	 *            : position x
	 * @param y
	 *            : position y
	 */
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter Position x.
	 * 
	 * @return positionX
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * Getter Position y.
	 * 
	 * @return positionY
	 */
	public int getY()
	{
		return y;
	}

	/** Move. */
	public void move(int x, int y)
	{
		try
		{
			setPosition(this.x + x, this.y + y);
		} catch (InvalidPositionException e)
		{
			// DO NOTHING!
		}

	}

	/** Setter for the Position
	 * @throws InvalidPositionException */
	private void setPosition(int x, int y) throws InvalidPositionException
	{
		if (x < 0 || y < 0)
		{
			throw new InvalidPositionException();
		}
		
		this.x = x;
		this.y = y;
	}
}
