package fr.iutvalence.ardechois.stealthgameproject.model;

//TODO Javadoc ;)
public class VisionField
{
	// Constants
	/**
	 * The default vision field width.
	 */
	public final static int DEFAULT_WIDTH = 5;

	/**
	 * The default vision field height;
	 */
	public final static int DEFAULT_HEIGHT = 3;

	// Attributes
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
	 * The current direction of the vision field.
	 * 
	 * @see Direction
	 */
	private Direction curDirection;

	/**
	 * Constructor with a position parameter.
	 * 
	 * @param position
	 *            The vision field position.
	 * @param initDir
	 *            The initial vision field direction.
	 */
	public VisionField(Position position, Direction initDir)
	{
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.position = position;
		this.curDirection = initDir;
	}

	/**
	 * Constructor with width, height and position parameters.
	 * 
	 * @param width
	 *            The vision field width.
	 * @param height
	 *            The vision field height.
	 * @param position
	 *            The vision field position.
	 * @param initDir
	 *            The initial vision field direction.
	 */
	public VisionField(int width, int height, Position position,
			Direction initDir)
	{
		this.width = width;
		this.height = height;
		this.position = position;
		this.curDirection = initDir;
	}

	/**
	 * Allow to rotate the vision field.
	 * 
	 * @param direction
	 */
	private void rotate(Direction direction)
	{
		switch (direction)
		{
		case UP:
				if (this.curDirection == Direction.RIGHT || this.curDirection == Direction.LEFT)
				{
					int widthTemp = this.width;
					this.width = this.height;
					this.height = widthTemp;
				}
				this.curDirection = Direction.UP;
			break;
		case DOWN:
			if (this.curDirection == Direction.RIGHT || this.curDirection == Direction.LEFT)
			{
				int widthTemp = this.width;
				this.width = this.height;
				this.height = widthTemp;
			}
			this.curDirection = Direction.DOWN;
			break;
		case LEFT:
			if (this.curDirection == Direction.UP || this.curDirection == Direction.DOWN)
			{
				int widthTemp = this.width;
				this.width = this.height;
				this.height = widthTemp;
			}
			this.curDirection = Direction.LEFT;
			break;
		case RIGHT:
			if (this.curDirection == Direction.UP || this.curDirection == Direction.DOWN)
			{
				int widthTemp = this.width;
				this.width = this.height;
				this.height = widthTemp;
			}
			this.curDirection = Direction.RIGHT;
			break;
		}

	}
	
	public void update(Direction direction)
	{
		rotate(direction);
	}
	
	public boolean check(Player player)
	{
		for (int i = 0; i != this.width; i++)
		{
			for (int j = 0; j != this.height; j++)
			{
				Position squarePosition = new Position(this.position.getX() + i, this.position.getY() + j);
				if (squarePosition == player.getPosition())
				{
					return true;
				}
			}
		}
		return false;
	}

}