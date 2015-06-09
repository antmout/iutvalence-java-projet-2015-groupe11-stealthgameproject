package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

//TODO Javadoc ;)
public class GameWindow extends JFrame 
{

	private static final long serialVersionUID = 1L;

	// TODO Javadoc ;)
	public static final int WINDOW_WIDTH = 808;
	// TODO Javadoc ;)
	public static final int WINDOW_HEIGHT = 670;

	// TODO Javadoc ;)
	public static final int PREFERRED_BLOCK_SIZE = 16;
	
	/**
	 * Default game window constructor.
	 * @param mapGetter
	 * @param playerGetter
	 * @param keyListener
	 */
	public GameWindow(LevelGetter levelGetter, MapGetter mapGetter, PlayerGetter playerGetter, KeyListener keyListener)
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setResizable(false);
		this.setTitle("Stealth Game Project: editor");

		JSplitPane mainPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		mainPanel.setEnabled(false);
		mainPanel.setDividerSize(0);
		
		mainPanel.add(new DisplayMap(levelGetter, mapGetter, playerGetter, PREFERRED_BLOCK_SIZE));
		
		this.addKeyListener(keyListener);

		// TODO Icon icon = new ImageIcon(getClass().getResource("/test.png"));
		
		this.setContentPane(mainPanel);

		this.setVisible(true);

	}
}
