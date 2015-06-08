package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import fr.iutvalence.ardechois.stealthgameproject.model.Map;

public class DisplayMap extends JPanel {

	private static final long serialVersionUID = 1L;

	public final Icon WALL = new ImageIcon(getClass().getResource("/test.png"));

	public static final Icon[] GROUND = {
	// TODO add pictures components.
	};

	public static final int NUM_COLS = 50;
	public static final int NUM_ROWS = 40;

	public static final int PREFERRED_GRID_SIZE_PIXEL = 16;

	private final Icon[][] groundGrid;

	public DisplayMap() {
		this.groundGrid = new Icon[NUM_COLS][NUM_ROWS];
		for (int i = 0; i < NUM_COLS; i++) {
			for (int j = 0; j < NUM_ROWS; j++) {
				this.groundGrid[i][j] = null; /* id blocks */
				// TODO récupérer id_block dans la classe map.
			}
		}
		int preferredWidth = NUM_COLS * PREFERRED_GRID_SIZE_PIXEL;
		int preferredHeight = NUM_ROWS * PREFERRED_GRID_SIZE_PIXEL;
		setPreferredSize(new Dimension(preferredWidth, preferredHeight));

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.clearRect(0, 0, getWidth(), getHeight());

		int rectWidth = 16;
		int rectHeight = 16;

		for (int i = 0; i < NUM_COLS; i++) {
			for (int j = 0; j < NUM_ROWS; j++) {
				// Upper left corner of this terrain rect
				int x = i * rectWidth;
				int y = j * rectHeight;
				Icon groundIcon = groundGrid[i][j];
				g.drawImage((Image) groundIcon, 0, 0, null);
				g.fillRect(x, y, rectWidth, rectHeight);
			}
		}

		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("testDisplayMap");
				DisplayMap map = new DisplayMap();
				frame.add(map);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});*/
	}
}
