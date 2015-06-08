package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel mainPanel;

	public static final int WINDOW_HEIGHT = 800;
	public static final int WINDOW_WIDTH = 640;

	/**
	 * Default GameWindow Constructor.
	 * 
	 */
	public GameWindow() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.mainPanel = new JPanel();
		getContentPane().add(this.mainPanel);

		this.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);

		this.setResizable(false);

		this.setTitle("Stealth Game Project.");
		
		GridLayout layout = new GridLayout(50, 40);
		mainPanel.setLayout(layout);
		
		// TODO Icon icon = new ImageIcon(getClass().getResource("/test.png"));
		
		this.setVisible(true);
		
	}
}
