package fr.iutvalence.ardechois.stealthgameproject;

import java.io.File;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.model.Blocks;
import fr.iutvalence.ardechois.stealthgameproject.model.Map;
import fr.iutvalence.ardechois.stealthgameproject.model.Position;

public class Editor
{
	private Map map;
	
	public Editor()
	{
		map = new Map();
	}
	
	public void setBlock(Position position, Blocks block)
	{
		try
		{
			map.setBlock(position, block);
		} catch (InvalidPositionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveMap(File file)
	{
		map.saveMapInFile(file);
	}
}
