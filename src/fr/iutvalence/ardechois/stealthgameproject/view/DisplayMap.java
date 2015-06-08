package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.model.Map;
import fr.iutvalence.ardechois.stealthgameproject.model.Position;

public class DisplayMap extends JPanel
{

	private static final long serialVersionUID = 1L;

	public static final int NUM_COLS = 50;
	public static final int NUM_ROWS = 40;

	public static final int PREFERRED_GRID_SIZE_PIXEL = 16;

	private int mapWidth;
	private int mapHeight;

	private final Icon[][] groundGrid;

	public DisplayMap(Map map)
	{
		this.mapWidth = map.getMapWidth();
		this.mapHeight = map.getMapHeight();

		this.groundGrid = new Icon[mapWidth][mapHeight];
		for (int i = 0; i < mapWidth; i++)
		{
			for (int j = 0; j < mapHeight; j++)
			{
				try
				{
					if (map.getBlock(new Position(i, j)) != null)
						this.groundGrid[i][j] = map.getBlock(new Position(i, j)).getIcon();
				} catch (InvalidPositionException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		int preferredWidth = mapWidth * PREFERRED_GRID_SIZE_PIXEL;
		int preferredHeight = mapWidth * PREFERRED_GRID_SIZE_PIXEL;
		setPreferredSize(new Dimension(preferredWidth, preferredHeight));

	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.clearRect(0, 0, getWidth(), getHeight());

		int rectWidth = 16;
		int rectHeight = 16;

		for (int i = 0; i < mapWidth; i++)
		{
			for (int j = 0; j < mapHeight; j++)
			{
				// Upper left corner of this terrain rect
				int x = i * rectWidth;
				int y = j * rectHeight;
				Icon groundIcon = groundGrid[i][j];
				//g.drawImage((Image) groundIcon, 0, 0, null);
				g.fillRect(x, y, rectWidth, rectHeight);
			}
		}

		/*
		 * SwingUtilities.invokeLater(new Runnable() { public void run() {
		 * JFrame frame = new JFrame("testDisplayMap"); DisplayMap map = new
		 * DisplayMap(); frame.add(map);
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.pack();
		 * frame.setVisible(true); } });
		 */
	}
}
