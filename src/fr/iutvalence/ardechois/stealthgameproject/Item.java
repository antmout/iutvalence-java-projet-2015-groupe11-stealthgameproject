package fr.iutvalence.ardechois.stealthgameproject;

/**
 * Creation of item
 * 
 * @author vanbossm
 * 
 * */
public class Item
{
	/** The Item Position. */
	private Position position;

	/**
	 * Constructor of Item Position
	 * 
	 * @param position
	 */
	public Item(Position position)
	{
		this.position = position;
	}
	
	public Position getPosition()
	{
		return position;
	}
	
}
