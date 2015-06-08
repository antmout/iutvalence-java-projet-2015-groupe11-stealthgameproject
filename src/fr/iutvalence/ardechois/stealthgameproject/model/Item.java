package fr.iutvalence.ardechois.stealthgameproject.model;

/**
 * Creation of item
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
	private static Position position;

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

	/**
	 * Getter Taken.
	 * 
	 * @return taken
	 * 
	 */
	public boolean isTaken()
	{
		return taken;
	}

}
