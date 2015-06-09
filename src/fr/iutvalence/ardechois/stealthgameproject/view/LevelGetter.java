package fr.iutvalence.ardechois.stealthgameproject.view;

import java.util.ArrayList;

import fr.iutvalence.ardechois.stealthgameproject.model.Position;

public interface LevelGetter
{
	Position getItemPosition();
	
	ArrayList<Position> getEnemiesPositions();
}
