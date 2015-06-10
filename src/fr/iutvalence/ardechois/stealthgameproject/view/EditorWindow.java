package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

//TODO Javadoc ;)
public class EditorWindow extends JFrame
{
	// TODO Javadoc ;)
	public static final int WINDOW_WIDTH = 808;
	// TODO Javadoc ;)
	public static final int WINDOW_HEIGHT = 670;

	// TODO Javadoc ;)
	public static final int PREFERRED_BLOCK_SIZE = 16;

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	// TODO Javadoc ;)
	public EditorWindow(LevelGetter levelGetter, MapGetter mapGetter, PlayerGetter playerGetter, MouseListener mouseListener)
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Stealth Game Project: editor");

		JSplitPane mainPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		mainPanel.setEnabled(false);
		mainPanel.setDividerSize(0);

		mainPanel.add(new DisplayMap(levelGetter, mapGetter, playerGetter, PREFERRED_BLOCK_SIZE));

		mainPanel.addMouseListener(mouseListener);

		this.setContentPane(mainPanel);

		this.setVisible(true);
		
		JOptionPane.showMessageDialog(null, "Click + : Ctrl = Object, Alt = Spawn, Shift = Enemy.");
	}
}
