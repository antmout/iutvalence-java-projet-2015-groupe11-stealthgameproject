package fr.iutvalence.ardechois.stealthgameproject.model;

/**
 * Represent an item.
 * 
 * @author vanbossm
 * 
 * */
public class Item
{
	/**
	 * The Item Position.
	 * 
	 * @see Position
	 * 
	 * */
	private Position position;

	/**
	 * True if the Item is already taken by the Character.
	 * 
	 * @see Character
	 * 
	 */
	private boolean taken;

	/**
	 * Constructor of Item Position
	 * 
	 * @param position
	 * 
	 */
	public Item(Position position)
	{
		this.position = position;
	}

	/**
	 * Getter for the Item Position.
	 * 
	 * @return position
	 * 
	 */
	public Position getPosition()
	{
		return position;
	}
	
	// TODO javadoc
	public void setPosition(Position position)
	{
		this.position = new Position(position.getX(), position.getY());
	}

	// TODO javadoc
	public void setPosition(int x, int y)
	{
		this.position = new Position(x, y);
		
	}

	/**
	 * Getter for the taken boolean.
	 * 
	 * @return taken
	 * 
	 */
	public boolean isTaken()
	{
		return taken;
	}
	
	public void setTaken(Position playerPosition)
	{
		this.taken = true;
		this.position = playerPosition;
	}

}
