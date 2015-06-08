package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

public class Player
{
	/**
	 * The character position
	 * 
	 * @see Position
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
