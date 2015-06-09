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
	 * Wall block.
	 * 
	 * @value "0"
	 */
	WALL('0', "/wall.png"),

	/**
	 * Floor block.
	 * 
	 * @value "1"
	 */
	FLOOR('1', "/floor.png");

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
