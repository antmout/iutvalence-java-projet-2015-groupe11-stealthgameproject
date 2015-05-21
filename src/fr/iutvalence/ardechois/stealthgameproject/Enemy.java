package fr.iutvalence.ardechois.stealthgameproject;

/**
 * Represent an enemy.
 * 
 * @author kelemenn
 * 
 * @version 0.1.0
 */
public class Enemy
{
	/** The enemy position */
	private Position position;
	/** The enemy vision field */
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
	 * @return position : The current position of the enemy.
	 */
	public Position getPosition()
	{
		return this.position;
	}
	
	/**
	 * Move the enemy to the neighbour square.
	 * 
	 * 
	 * @param direction :
	 * 				The move direction.
	 * @param mapHeight :
	 * 				The map height.
	 * @param mapWidth :
	 * 				The map width.
	 */
	public void move(Direction direction, int mapHeight, int mapWidth)
	{
		switch(direction)
		{

		}
		if (direction == Direction.UP)
		{
			// TODO move up.
		}
		
		if (direction == Direction.DOWN)
		{
			// TODO move down.
		}
		
		if (direction == Direction.LEFT)
		{
			// TODO move left.
		}
		
		if (direction == Direction.RIGHT)
		{
			// TODO move right.
		}
	}

}
