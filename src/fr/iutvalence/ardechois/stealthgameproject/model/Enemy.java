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
	/** The enemy position.
	 * @see Position
	 */
	private Position position;
	/** The enemy vision field. 
	 *  @see VisionField
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
	 * 
	 * @param direction
	 *            : The move direction.
	 * @param mapHeight
	 *            : The map height.
	 * @param mapWidth
	 *            : The map width.
	 */
	public void move(Direction direction, int mapHeight, int mapWidth)
			throws InvalidPositionException
	{
		switch (direction)
		{
		case UP:
			if (this.position.getY() + 1 > mapHeight)
				throw new InvalidPositionException();
			this.position.move(0, 1);
			break;
		case DOWN:
			if (this.position.getY() - 1 < 0)
				throw new InvalidPositionException();
			this.position.move(0, -1);
			break;
		case LEFT:
			if (this.position.getX() - 1 < 0)
				throw new InvalidPositionException();
			this.position.move(-1, 0);
			break;
		case RIGHT:
			if (this.position.getX() + 1 > mapWidth)
				throw new InvalidPositionException();
			this.position.move(1, 0);
			break;
		}
	}

}
