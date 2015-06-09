package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import fr.iutvalence.ardechois.stealthgameproject.model.Map;

public class EditorWindow extends JFrame
{
	public static final int WINDOW_WIDTH = 808;
	public static final int WINDOW_HEIGHT = 670;
	
	public static final int PREFERRED_BLOCK_SIZE = 16;

	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	public EditorWindow(Map map, MouseListener mouseListener)
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setResizable(false);
		this.setTitle("Stealth Game Project: editor");

		JSplitPane mainPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		mainPanel.setEnabled(false);
		mainPanel.setDividerSize(0);
		
		mainPanel.add(new DisplayMap(map, PREFERRED_BLOCK_SIZE));
		
		mainPanel.addMouseListener(mouseListener);
		
		this.setContentPane(mainPanel);

		this.setVisible(true);
	}
}