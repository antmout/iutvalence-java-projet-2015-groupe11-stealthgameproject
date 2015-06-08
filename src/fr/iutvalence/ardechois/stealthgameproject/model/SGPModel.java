package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;


public class SGPModel
{
  private Player player;
  
  private Level currentLevel;
  
  
  public void move(Direction direction)
  {
      try
    {
        player.move(direction, currentLevel.getCurrentMap().getMapWidth(), currentLevel.getCurrentMap().getMapHeight());
    } catch (InvalidPositionException e)
    {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
}
