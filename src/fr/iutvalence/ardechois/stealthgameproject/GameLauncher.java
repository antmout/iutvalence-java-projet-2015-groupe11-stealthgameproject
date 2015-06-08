package fr.iutvalence.ardechois.stealthgameproject;

import java.io.FileNotFoundException;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidMapSizeException;
import fr.iutvalence.ardechois.stealthgameproject.model.Map;

/**
 * Allow to launch the application.
 * 
 * @author antoine
 * @version 0.1.0
 */
public class GameLauncher
{

	public static void main(String[] args)
	{
		try
		{
			Map map = new Map();
			
			map.saveMapInFile("map1.txt");
			map.loadMapFromFile("map1.txt");
		} catch (InvalidMapSizeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
