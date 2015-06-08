package fr.iutvalence.ardechois.stealthgameproject.model;

/**
 * Choice of direction.
 * 
 * @author kelemenn
 * 
 * @version 0.1.0
 */
public enum Direction

{
    /**
     * .
     * 
     * @value "0,1"
     */
    UP(0, 1),

    /**
     * .
     * 
     * @value "0,-1"
     */
    DOWN(0, -1),

    /**
     * .
     * 
     * @value "-1,0"
     */
    LEFT(-1, 0),

    /**
     * .
     * 
     * @value "1,0"
     */
    RIGHT(1, 0);

    private int x;
    private int y;

    /**
     * Player direction, only one character.
     */

    private Direction(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    /**
     * Getter Position x.
     * 
     * @return positionX
     */
   
    public int getX()
    {
        return x;
    }
    
    /**
     * Getter Position y.
     * 
     * @return positionY
     */
    public int getY()
    {
        return y;
    }
}