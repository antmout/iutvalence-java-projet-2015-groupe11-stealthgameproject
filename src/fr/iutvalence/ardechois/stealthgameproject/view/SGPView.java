package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.KeyListener;


public class SGPView
{
	private GameWindow gameWindow;
	
	public SGPView(MapGetter mapGetter, PlayerGetter playerGetter, KeyListener keyListener)
	{
		gameWindow = new GameWindow(mapGetter, playerGetter, keyListener);
	}

	public void updateWindow()
	{
		gameWindow.repaint();
		
	}
}
