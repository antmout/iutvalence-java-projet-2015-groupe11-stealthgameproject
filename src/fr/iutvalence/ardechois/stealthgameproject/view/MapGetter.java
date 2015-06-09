package fr.iutvalence.ardechois.stealthgameproject.view;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.model.Blocks;
import fr.iutvalence.ardechois.stealthgameproject.model.Position;

public interface MapGetter
{
	public Blocks getBlock(Position position) throws InvalidPositionException;
	
	public int getMapWidth();
	
	public int getMapHeight();
}
