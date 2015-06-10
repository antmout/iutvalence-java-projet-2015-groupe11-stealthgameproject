package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

//TODO Javadoc ;)
public class SGPView
{
	// TODO Javadoc ;)
	private GameWindow gameWindow;
	
	// TODO Javadoc ;)
	public SGPView(LevelGetter levelGetter, MapGetter mapGetter, PlayerGetter playerGetter, KeyListener keyListener)
	{
		gameWindow = new GameWindow(levelGetter, mapGetter, playerGetter, keyListener);
	}

	// TODO Javadoc ;)
	public void updateWindow()
	{
		gameWindow.repaint();
	}

	// TODO Javadoc
	public void closeWindowAndApp()
	{
		this.closeWindow();
		// Application don't stop if we don't exit it.
		System.exit(0);
	}

	public void closeWindow()
	{
		gameWindow.dispose();
	}
}
