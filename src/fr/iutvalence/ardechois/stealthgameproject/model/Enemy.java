package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

/**
 * Represent an enemy.
 * 
 * @author kelemenn
 * 
 * @version 0.1.0
 */
public class Enemy
{
	/**
	 * The enemy position.
	 * 
	 * @see Position
	 */
	private Position position;
	/**
	 * The enemy vision field.
	 * 
	 * @see VisionField
	 */
	private static VisionField visionField;

	/**
	 * Constructor with a position parameter.
	 * 
	 * @param position
	 *            : The starting enemy position.
	 * @param visionField
	 *            : The enemy vision field.
	 */
	public Enemy(Position position, VisionField visionField)
	{
		this.position = position;
		this.visionField = visionField;
	}

	/**
	 * Getter for the attribute position.
	 * 
	 * @return position : The current enemy position.
	 */
	public Position getPosition()
	{
		return this.position;
	}

	/**
	 * Move the enemy to the neighbor square.
	 * 
	 * @param direction
	 * @param map
	 * @throws InvalidPositionException
	 */
	public void move(Direction direction, Map map) throws InvalidPositionException
	{
		switch (direction)
		{
		case UP:
			if (this.position.getY() + 1 > map.getMapHeight())
				throw new InvalidPositionException();
			this.position.move(direction);
			break;
		case DOWN:
			if (this.position.getY() - 1 < 0)
				throw new InvalidPositionException();
			this.position.move(direction);
			break;
		case LEFT:
			if (this.position.getX() - 1 < 0)
				throw new InvalidPositionException();
			this.position.move(direction);
			break;
		case RIGHT:
			if (this.position.getX() + 1 > map.getMapWidth())
				throw new InvalidPositionException();
			this.position.move(direction);
			break;
		}
	}

}
