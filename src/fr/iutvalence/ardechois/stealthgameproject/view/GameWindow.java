package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final int WINDOW_WIDTH = 808;
	public static final int WINDOW_HEIGHT = 670;

	/**
	 * Default GameWindow Constructor.
	 * 
	 */
	public GameWindow() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		this.setResizable(false);

		this.setTitle("Stealth Game Project.");
		
		GridLayout layout = new GridLayout(50, 40);
		mainPanel.setLayout(layout);
		
		// TODO Icon icon = new ImageIcon(getClass().getResource("/test.png"));
		
		this.setVisible(true);
		
	}
}
