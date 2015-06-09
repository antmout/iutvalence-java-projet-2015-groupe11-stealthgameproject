package fr.iutvalence.ardechois.stealthgameproject.model;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;

//TODO Javadoc ;)
public class SGPModel
{
	// TODO Javadoc ;)
	private Player player;

	// TODO Javadoc ;)
	private Level currentLevel;

	// TODO Javadoc ;)
	public SGPModel()
	{
		player = new Player(new Position(0, 0));
		currentLevel = new Level();
	}

	// TODO Javadoc ;)
	public void move(Direction direction)
	{
		try
		{
			player.move(direction, currentLevel.getCurrentMap());
		} catch (InvalidPositionException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	// TODO Javadoc ;)
	public Player getPlayer()
	{
		return this.player;
	}
	
	// TODO Javadoc ;)
	public Level getLevel()
	{
		return currentLevel;
	}
}
