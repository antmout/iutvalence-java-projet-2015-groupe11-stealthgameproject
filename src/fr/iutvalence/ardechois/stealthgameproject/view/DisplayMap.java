package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DisplayMap extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public final Icon icon = new ImageIcon(getClass().getResource("/test.png"));
	
	
	public static final int NUM_ROWS = 50;
	public static final int NUM_COLS = 40;
	
	public static final int PREFERRED_GRID_SIZE_PIXEL = 16;
	
	private final Icon[][] groundGrid;
	
	public DisplayMap(){
		this.groundGrid = new Icon[NUM_ROWS][NUM_COLS];
		for (int i = 0; i < NUM_COLS; i++){
			for (int j =0; j < NUM_ROWS; j++){
				this.groundGrid[i][j] = null; /* id blocks*/
				//TODO récupérer id blocks dans la classe map.
			}
		}
		int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXEL;
		int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXEL;
		setPreferredSize(new Dimension(preferredWidth, preferredHeight));
		
	}
}
