package fr.iutvalence.ardechois.stealthgameproject;

import java.io.File;
import java.util.HashMap;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidMapSizeException;
import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

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
	
	/**
	 * Max map width in <b>block</b>.
	 */
	public static final int MAX_MAP_WIDTH = 50;
	
	/**
	 * Max map height in <b>block</b>.
	 */
	public static final int MAX_MAP_HEIGHT = 40;

	// Attributes
	/**
	 * Map grid.
	 */
	private final Blocks[][] grid;
	
	/**
	 * HashMap that contains link between String and Blocks.
	 */
	private HashMap<String, Blocks> hashMap;

	// Constructors
	/**
	 * Create a default map. 
	 * @throws InvalidMapSizeException 
	 */
	public Map() throws InvalidMapSizeException
	{
		this(DEFAULT_MAP_WIDTH, DEFAULT_MAP_WIDTH);
	}

	/**
	 * Create a map with given width and height.
	 * 
	 * @param width
	 * @param height
	 * @throws InvalidMapSizeException 
	 */
	public Map(int width, int height) throws InvalidMapSizeException
	{
		if(width < 0 || height < 0 || width > MAX_MAP_WIDTH || height > MAX_MAP_HEIGHT)
		{
			throw new InvalidMapSizeException();
		}
			
		this.grid = new Blocks[width][height];
		setHashMap();
	}

	// Methods
	/**
	 * Set the HashMap with Blocks enumeration values.
	 * 
	 * @see Blocks
	 * @see #hashMap
	 */
	private void setHashMap()
	{
		this.hashMap = new HashMap<String, Blocks>();
		for(Blocks block : Blocks.values())
		{
			this.hashMap.put(block.getId(), block);
		}
	}
	
	/**
	 * Get the current map width.
	 * 
	 * @return map width
	 */
	public int getMapWidth()
	{
		return grid.length;
	}

	/**
	 * Get the current map height.
	 * 
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
	 * @throws InvalidPositionException
	 */
	public Blocks getBlock(Position position) throws InvalidPositionException
	{
		if (position.getX() < 0 || position.getY() < 0 || position.getX() > getMapWidth() || position.getY() > getMapHeight())
		{
			throw new InvalidPositionException();
		}
		
		return grid[position.getX()][position.getY()];
	}
	
	/**
	 * Place a block at the given position.
	 * 
	 * @param position
	 * @param block
	 * @throws InvalidPositionException 
	 */
	public void setBlock(Position position, Blocks block) throws InvalidPositionException
	{
		if (position.getX() < 0 || position.getY() < 0 || position.getX() > getMapWidth() || position.getY() > getMapHeight())
		{
			throw new InvalidPositionException();
		}
		
		grid[position.getX()][position.getY()] = block;
	}
	
	/**
	 * Load a map from the filename.
	 * @param filename
	 */
	private void loadMapFromFile(String filename)
	{
		loadMapFromFile(new File(filename));
	}
	
	/**
	 * Load a map from the file.
	 * @param file
	 */
	private void loadMapFromFile(File file)
	{
		
	}
}
