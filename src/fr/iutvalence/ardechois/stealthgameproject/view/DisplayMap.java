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

	private int mapWidth;
	private int mapHeight;
	private int preferredBlockSize;

	private final Icon[][] groundGrid;

	public DisplayMap(Map map, int preferredBlockSize)
	{
		this.mapWidth = map.getMapWidth();
		this.mapHeight = map.getMapHeight();
		this.preferredBlockSize = preferredBlockSize;

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
		int preferredWidth = mapWidth * this.preferredBlockSize;
		int preferredHeight = mapWidth * this.preferredBlockSize;
		setPreferredSize(new Dimension(preferredWidth, preferredHeight));

	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.clearRect(0, 0, getWidth(), getHeight());

		int rectWidth = this.preferredBlockSize;
		int rectHeight = this.preferredBlockSize;

		for (int i = 0; i < mapWidth; i++)
		{
			for (int j = 0; j < mapHeight; j++)
			{
				// Upper left corner of this terrain rect
				int x = i * rectWidth;
				int y = j * rectHeight;
				Icon groundIcon = groundGrid[i][j];
				if(groundIcon != null)
					g.drawImage(((ImageIcon) groundIcon).getImage(), x, y, null);
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
