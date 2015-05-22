package fr.iutvalence.ardechois.stealthgameproject;

/**
 * Block that compose the map.
 * 
 * @author chayc
 *
 */
public enum Blocks
{
	WALL("0"), FLOOR("1");

	private String id;

	private Blocks(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return this.id;
	}
}
