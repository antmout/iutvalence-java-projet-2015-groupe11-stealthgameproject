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
	public Position move(int x, int y)
	{

		return null;

	}

	/**
	 * @throws InvalidPositionException */
	private void setPosition(int x, int y) throws InvalidPositionException
	{
		if (this.x + x > Map.DEFAULT_MAP_WIDTH
				|| this.x + x < 0
				|| this.y + y > Map.DEFAULT_MAP_HEIGHT
				|| this.y + y < 0)
		{
			throw new InvalidPositionException();
		}
	}
}
