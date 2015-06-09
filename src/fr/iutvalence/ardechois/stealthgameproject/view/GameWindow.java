package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.GridLayout;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class GameWindow extends JFrame 
{

	private static final long serialVersionUID = 1L;

	public static final int WINDOW_WIDTH = 808;
	public static final int WINDOW_HEIGHT = 670;

	public static final int PREFERRED_BLOCK_SIZE = 16;
	
	/**
	 * Default GameWindow Constructor.
	 * 
	 */
	public GameWindow(MapGetter mapGetter, PlayerGetter playerGetter, KeyListener keyListener)
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setResizable(false);
		this.setTitle("Stealth Game Project: editor");

		JSplitPane mainPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		mainPanel.setEnabled(false);
		mainPanel.setDividerSize(0);
		
		mainPanel.add(new DisplayMap(mapGetter, playerGetter, PREFERRED_BLOCK_SIZE));
		
		mainPanel.addKeyListener(keyListener);

		// TODO Icon icon = new ImageIcon(getClass().getResource("/test.png"));
		
		this.setContentPane(mainPanel);

		this.setVisible(true);

	}
}
