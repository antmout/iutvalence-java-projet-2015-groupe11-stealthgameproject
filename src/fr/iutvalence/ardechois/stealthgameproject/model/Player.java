package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

public class Player
{
	/** The character position
	 *  @see Position
	 */
	private Position position;

	/**
	 * Constructor whit a position parameter.
	 * 
	 * @param position
	 *            :
	 * 
	 */
	public Player(Position position)
	{
		this.position = position;
	}
	
	/**
	 * Getter for the attribute position.
	 * 
	 * @return position : The current character position.
	 */
	public Position getPosition()
	{
		return this.position;
	}

	
	/**
	 * Move the character to the neighbor square.
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
