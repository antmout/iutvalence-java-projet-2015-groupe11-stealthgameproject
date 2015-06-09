package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.view.PlayerGetter;

public class Player implements PlayerGetter
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
			break;
		case DOWN:
			if (this.position.getY() - 1 < 0)
				throw new InvalidPositionException();
			break;
		case LEFT:
			if (this.position.getX() - 1 < 0)
				throw new InvalidPositionException();
			break;
		case RIGHT:
			if (this.position.getX() + 1 > map.getMapWidth())
				throw new InvalidPositionException();
			break;
		}
		
		if(map.getBlock(new Position(this.position.getX() + direction.getX(), this.position.getY()+direction.getY())) != Blocks.WALL)
			this.position.move(direction);
	}
}
