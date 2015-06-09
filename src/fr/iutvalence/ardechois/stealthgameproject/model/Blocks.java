package fr.iutvalence.ardechois.stealthgameproject.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Block that compose the map.
 * 
 * @author chayc
 *
 */
public enum Blocks
{
	/**
	 * Floor block.
	 * 
	 * @value "0"
	 */
	FLOOR('0', "/floor.png"),
	
	/**
	 * Wall block.
	 * 
	 * @value "1"
	 */
	WALL('1', "/wall.png"),
	
	/**
	 * Grass block
	 * 
	 * @value "2"
	 */
	GRASS('2', "/grass.png");

	/**
	 * Block id, only one character.
	 */
	private char id;

	private Icon icon;

	/**
	 * Give an id to a block.
	 * 
	 * @param id
	 */
	private Blocks(char id, String filename)
	{
		this.id = id;
		this.icon = new ImageIcon(getClass().getResource(filename));
	}

	/**
	 * Get the block id.
	 * 
	 * @return id
	 */
	public char getId()
	{
		return this.id;
	}

	/**
	 * Get the block icon.
	 * 
	 * @return icon
	 */
	public Icon getIcon()
	{
		return this.icon;
	}
	
	public Blocks getNext()
	{
		return values()[(ordinal()+1) % values().length];
	}
}
