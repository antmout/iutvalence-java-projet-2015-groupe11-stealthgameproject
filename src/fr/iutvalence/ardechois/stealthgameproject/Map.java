package fr.iutvalence.ardechois.stealthgameproject;

/**
 * Map on which the player will play.
 * 
 * @author chayc
 * @version 0.1.0
 *
 */
public class Map
{
	// Constants
	/**
	 * Default map width in <b>block</b>.
	 */
	public static final int DEFAULT_MAP_WIDTH = 10;
	/**
	 * Default map height in <b>block</b>.
	 */
	public static final int DEFAULT_MAP_HEIGHT = 10;
	
	// Attributes
	/**
	 * Map grid.
	 */
	private final Block[][] grid;
	
	// Constructors
	/**
	 * Create a default map.
	 */
	public Map()
	{
		this(DEFAULT_MAP_WIDTH, DEFAULT_MAP_WIDTH);
	}
	
	/**
	 * Create a map with given width and height.
	 * @param width
	 * @param height
	 */
	public Map(int width, int height)
	{
		this.grid = new Block[width][height];
	}
	
	//Methods
	/**
	 * Get the current map width.
	 * @return map width
	 */
	public int getMapWidth()
	{
		return grid.length;
	}
	
	/**
	 * Get the current map height.
	 * @return map height
	 */
	public int getMapHeight()
	{
		return grid[0].length;
	}
	
	/**
	 * Get a block that have the asked position.
	 * 
	 * @param position
	 * @return block
	 */
	public Block getBlock(Position position)
	{
		return grid[position.getX()][position.getY()];
	}
}
