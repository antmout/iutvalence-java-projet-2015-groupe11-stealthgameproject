package fr.iutvalence.ardechois.stealthgameproject.view;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.model.Blocks;
import fr.iutvalence.ardechois.stealthgameproject.model.Position;

//TODO Javadoc ;)
public interface MapGetter
{
	// TODO Javadoc ;)
	public Blocks getBlock(Position position) throws InvalidPositionException;
	
	// TODO Javadoc ;)
	public int getMapWidth();

	// TODO Javadoc ;)
	public int getMapHeight();

	// TODO Javadoc ;)
	public Position getSpawnPosition();

	// TODO Javadoc ;)
	public void setSpawnPosition(Position spawnPosition);
}
