package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

//TODO Javadoc ;)
public class VisionField
{
	//Constants
	/**
	 * The default vision field width.
	 */
	public final static int DEFAULT_WIDTH = 5;
	
	/**
	 * The default vision field height;
	 */
	public final static int DEFAULT_HEIGHT = 3;
	
	//Attributes
	/**
	 * The vision field width
	 */
	private int width;

	/**
	 * The vision field height
	 */
	private int height;

	/**
	 * The vision field position
	 * 
	 * @see Position
	 */
	private Position position;

	/**
	 * Constructor with a position parameter.
	 * 
	 * @param position
	 * 			The vision field position.
	 */
	public VisionField(Position position)
	{
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.position = position;
	}
	
	/**
	 * Constructor with width, height and position parameters.
	 * 
	 * @param width
	 * 			The vision field width.
	 * @param height
	 * 			The vision field height.
	 * @param position
	 * 			The vision field position.
	 */
	public VisionField(int width, int height, Position position)
	{
		this.width = width;
		this.height = height;
		this.position = position;
	}
	
	/**
	 * Allow to rotate the vision field.
	 */
	private void rotate()
	{
		int widthTemp = this.width;
		this.width = this.height;
		this.height = widthTemp;
	}
	
	/**
	 * Allow to move the vision field.
	 * 
	 * @param rotate
	 * 			true if a vision field rotation is needed.
	 */
	public void move(Direction direction, boolean rotate, Map map) throws InvalidPositionException
	{
		if (rotate)
			this.rotate();
		
			switch (direction)
			{
			case UP:
				if (this.position.getY() - 1 < 0)
					throw new InvalidPositionException();
				break;
			case DOWN:
				if (this.position.getY() + 1 >= map.getMapHeight())
					throw new InvalidPositionException();
				break;
			case LEFT:
				if (this.position.getX() - 1 < 0)
					throw new InvalidPositionException();
				break;
			case RIGHT:
				if (this.position.getX() + 1 >= map.getMapWidth())
					throw new InvalidPositionException();
				break;
			}
			
			if(map.getBlock(new Position(this.position.getX() + direction.getX(), this.position.getY()+direction.getY())) != Blocks.WALL)
				this.position.move(direction);
		
	}

}