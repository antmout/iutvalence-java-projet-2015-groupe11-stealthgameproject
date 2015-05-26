package fr.iutvalence.ardechois.stealthgameproject;

/**
 * Block that compose the map.
 * 
 * @author chayc
 *
 */
public enum Blocks
{
	/**
	 * Wall block.
	 * @value "0"
	 */
	WALL("0"), 
	
	/**
	 * Floor block.
	 * @value "1"
	 */
	FLOOR("1");

	/**
	 * Block id, only one character.
	 */
	private String id;

	/**
	 * Give an id to a block.
	 * @param id
	 */
	private Blocks(String id)
	{
		this.id = id;
	}
	
	/**
	 * Get the block id.
	 * @return id
	 */
	public String getId()
	{
		return this.id;
	}
}
