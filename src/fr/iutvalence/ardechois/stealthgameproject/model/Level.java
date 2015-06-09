package fr.iutvalence.ardechois.stealthgameproject.model;

import java.io.File;
import java.util.ArrayList;
import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidMapSizeException;
import fr.iutvalence.ardechois.stealthgameproject.view.LevelGetter;

/**
 * Level of the game.
 * 
 * @author antoine
 * @version 0.1.0
 *
 */
public class Level implements LevelGetter
{

    // Constants

    // Attributes

    /** Current Map of the level. */
    private Map currentMap;

    /** List of the current enemies. */
    private ArrayList<Enemy> enemyList;

    /** Current item of the level. */
    private Item currentItem;

    // Constructors
    
    /**
     * Default constructor of the level.
     */
    public Level()
    {
        currentItem = new Item(new Position(0, 0));
        enemyList = new ArrayList<Enemy>();
        
		try
		{
			currentMap = new Map("tempMap.txt", currentItem);
		} catch (InvalidMapSizeException e)
		{
			e.printStackTrace();
		}
    }
    
    public Level(File file)
    {
    	currentItem = new Item(new Position(0, 0));
    	enemyList = new ArrayList<Enemy>();
    	enemyList.add(new Enemy(new Position(5, 5), Direction.UP));
    	enemyList.add(new Enemy(new Position(12, 12), Direction.DOWN));
    	currentMap = new Map(file, currentItem);
    }
    
    // Methods
    /**
     * Getter of the current map.
     * 
     * @return currentMap
     */
    public Map getCurrentMap()
    {
        return currentMap;
    }

    /**
     * Getter of the current item.
     * 
     * @return currentItem
     */
    public Item getCurrentItem()
    {
        return currentItem;
    }

    /**
     * Setter of the current item.
     * 
     * @param currentItem
     */
    public void setCurrentItem(Item currentItem)
    {
        this.currentItem = currentItem;
    }

	@Override
	public Position getItemPosition()
	{
		return currentItem.getPosition();
	}
	
	public boolean checkAllVisionFields(Player player)
	{
		for(Enemy enemy : enemyList)
		{
			if(enemy.checkVisionField(player))
				return true;
		}
		return false;
	}

	public void updateItem(Player player)
	{
		if(player.getPosition().getX() == currentItem.getPosition().getX() && player.getPosition().getY() == currentItem.getPosition().getY())
		{
			currentItem.setTaken(player.getPosition());
		}
	}

	public boolean hasWon(Player player)
	{
		return (currentItem.isTaken() && (currentMap.getSpawnPosition().getX() == player.getPosition().getX() && currentMap.getSpawnPosition().getY() == player.getPosition().getY()));
	}

	@Override
	public ArrayList<Position> getEnemiesPositions()
	{
		ArrayList<Position> positions = new ArrayList<Position>();
		for(Enemy enemy : enemyList)
		{
			positions.add(enemy.getPosition());
		}
		
		return positions;
	}

	public void moveEnemies()
	{
		for(Enemy enemy : enemyList)
		{
			enemy.randomMove(currentMap);
		}
		
	}
}
