package fr.iutvalence.ardechois.stealthgameproject.model;

import java.io.File;

import javax.swing.JOptionPane;

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
		currentLevel = new Level();
		player = new Player(currentLevel.getCurrentMap().getSpawnPosition());
	}
	
	// TODO javadoc
	public SGPModel(String filename)
	{
		currentLevel = new Level(new File(filename));
		player = new Player(currentLevel.getCurrentMap().getSpawnPosition());
	}

	// TODO Javadoc ;)
	public void move(Direction direction)
	{
		try
		{
			player.move(direction, currentLevel.getCurrentMap());
			
			if(currentLevel.checkAllVisionFields(player))
			{
				System.out.println("perdu");
			}
			
			currentLevel.updateItem(player);

		} catch (InvalidPositionException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	public boolean hasWon()
	{
		return currentLevel.hasWon(player);
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
