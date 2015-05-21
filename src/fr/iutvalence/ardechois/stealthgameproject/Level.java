package fr.iutvalence.ardechois.stealthgameproject;

import java.util.ArrayList;

/**
 * Level of the game.
 * 
 * @author antoine
 * @version 0.1.0
 *
 */
public class Level
{

    // Constants

    // Attributes

    /** Current Map of the level. */
    private Map currentMap;

    /** List of the current enemies. */
    private ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
    
     /** Current item of the level. */
    private Item currentItem;

    // Constructors

    // Methods
    /**
     * Setter of the current map.
     * 
     * @param map
     */
    public void setCurrentMap(Map map)
    {
        this.currentMap = map;
    }

    /**
     * Getter of the current map.
     * 
     * @return currentMap
     * @deprecated
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
}
