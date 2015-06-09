package fr.iutvalence.ardechois.stealthgameproject.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidMapSizeException;
import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.view.MapGetter;

/**
 * Map on which the player will play.
 * 
 * @author chayc
 * @version 0.1.0
 *
 */
public class Map implements MapGetter
{
	// Constants

	/**
	 * Max map width in <b>block</b>.
	 */
	public static final int MAX_MAP_WIDTH = 50;

	/**
	 * Max map height in <b>block</b>.
	 */
	public static final int MAX_MAP_HEIGHT = 40;

	/**
	 * Default map width in <b>block</b>.
	 */
	private static final int DEFAULT_MAP_WIDTH = 10;

	/**
	 * Default map height in <b>block</b>.
	 */
	private static final int DEFAULT_MAP_HEIGHT = 10;

	// Attributes
	/**
	 * Map grid.
	 */
	private Blocks[][] grid;

	/**
	 * HashMap that contains link between String and Blocks.
	 */
	private HashMap<Character, Blocks> hashMap;

	// Constructors

	// Empty maps
	public Map() throws InvalidMapSizeException
	{
		this(DEFAULT_MAP_WIDTH, DEFAULT_MAP_HEIGHT);
	}

	public Map(int width, int height) throws InvalidMapSizeException
	{
		setHashMap();
		
		if(width < 0 || height < 0 || width > MAX_MAP_WIDTH || height > MAX_MAP_HEIGHT)
			throw new InvalidMapSizeException();
		
		this.grid = new Blocks[width][height];
		
		for(int x=0; x<getMapWidth(); x++)
		{
			for(int y=0; y<getMapHeight(); y++)
			{
				this.grid[x][y] = Blocks.FLOOR;
			}
		}
	}

	// Map from file
	public Map(String filename) throws InvalidMapSizeException
	{
		this(new File(filename));
	}

	public Map(File file) throws InvalidMapSizeException
	{
		setHashMap();
		loadMapFromFile(file);
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
		this.hashMap = new HashMap<Character, Blocks>();
		for (Blocks block : Blocks.values())
		{
			this.hashMap.put(Character.valueOf(block.getId()), block);
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
		if (position.getX() < 0 || position.getY() < 0 || position.getX() >= getMapWidth() || position.getY() >= getMapHeight())
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
		if (position.getX() < 0 || position.getY() < 0 || position.getX() >= getMapWidth() || position.getY() >= getMapHeight())
		{
			throw new InvalidPositionException();
		}

		grid[position.getX()][position.getY()] = block;
	}

	/**
	 * Load a map from the filename.
	 * 
	 * @param filename
	 * @throws InvalidMapSizeException
	 */
	public void loadMapFromFile(String filename) throws InvalidMapSizeException
	{
		loadMapFromFile(new File(filename));
	}

	/**
	 * Load a map from the file.
	 * 
	 * @param file
	 * @throws InvalidMapSizeException
	 */
	public void loadMapFromFile(File file) throws InvalidMapSizeException
	{
		try
		{
			FileReader fileReader = new FileReader(file);

			int width = fileReader.read();
			int height = fileReader.read();

			if (width < 0 || width > MAX_MAP_WIDTH || height < 0 || height > MAX_MAP_HEIGHT)
			{
				fileReader.close();
				throw new InvalidMapSizeException();
			}

			this.grid = new Blocks[width][height];

			for (int lineNumber = 0; lineNumber < height; lineNumber++)
			{
				for (int columnNumber = 0; columnNumber < width; columnNumber++)
				{
					grid[columnNumber][lineNumber] = hashMap.get((char) fileReader.read());
				}
			}

			fileReader.close();

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Save the map in the file.
	 * 
	 * @param filename
	 */
	public void saveMapInFile(String filename)
	{
		saveMapInFile(new File(filename));
	}

	/**
	 * Save the map in the file.
	 * 
	 * @param file
	 */
	public void saveMapInFile(File file)
	{
		try
		{
			FileWriter fileWriter = new FileWriter(file);

			fileWriter.write(getMapWidth());
			fileWriter.write(getMapHeight());

			for (int lineNumber = 0; lineNumber < getMapHeight(); lineNumber++)
			{
				for (int columnNumber = 0; columnNumber < getMapWidth(); columnNumber++)
				{
					if (grid[columnNumber][lineNumber] != null)
						fileWriter.write(grid[columnNumber][lineNumber].getId());
				}
			}

			fileWriter.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void reset()
	{
		for (int lineNumber = 0; lineNumber < getMapHeight(); lineNumber++)
		{
			for (int columnNumber = 0; columnNumber < getMapWidth(); columnNumber++)
			{
				grid[columnNumber][lineNumber] = Blocks.GRASS;
			}
		}
		
	}
}
