package fr.iutvalence.ardechois.stealthgameproject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidMapSizeException;
import fr.iutvalence.ardechois.stealthgameproject.exceptions.InvalidPositionException;
import fr.iutvalence.ardechois.stealthgameproject.model.Blocks;
import fr.iutvalence.ardechois.stealthgameproject.model.Map;
import fr.iutvalence.ardechois.stealthgameproject.model.Position;
import fr.iutvalence.ardechois.stealthgameproject.view.EditorWindow;

/**
 * Allow to edit a map.
 * 
 * @author antoine
 * @version 0.1.0
 */
public class Editor implements MouseListener
{
	// TODO Javadoc ;)
	public static final String DEFAULT_MAP_NAME = "tempMap.txt";

	/**
	 * The map which is edited.
	 * 
	 * @see Map
	 */
	private Map map;
	/**
	 * The Editor window.
	 * 
	 * @see EditorWindow
	 */
	private EditorWindow editorWindow;

	// TODO Javadoc ;)
	private File file;

	/**
	 * Default constructor.
	 */
	public Editor()
	{
		try
		{
			this.file = new File(DEFAULT_MAP_NAME);
			this.map = new Map(this.file);
			this.editorWindow = new EditorWindow(map, null, this);
		}
		catch (InvalidMapSizeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TODO Javadoc ;)
	public Editor(String filename)
	{
		this(new File(filename));
	}

	// TODO Javadoc ;)
	public Editor(File file)
	{
		try
		{
			this.file = file;
			this.map = new Map(this.file);
			this.editorWindow = new EditorWindow(map, null, this);
		}
		catch (InvalidMapSizeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TODO Javadoc ;)
	public void setBlock(Position position, Blocks block)
	{
		try
		{
			map.setBlock(position, block);
		}
		catch (InvalidPositionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Save the edited map in a target file.
	 * 
	 * @param filename
	 */
	public void saveMap(String filename)
	{
		saveMap(new File(filename));
	}

	/**
	 * Save the edited map in a target file.
	 * 
	 * @param file
	 *            The target file in which the map will be saved.
	 */
	public void saveMap(File file)
	{
		map.saveMapInFile(file);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		switch (e.getButton())
		{
			case MouseEvent.BUTTON1 :
				Position mousePositionBlock = new Position(e.getX() / EditorWindow.PREFERRED_BLOCK_SIZE, e.getY()
						/ EditorWindow.PREFERRED_BLOCK_SIZE);
				try
				{
					map.setBlock(mousePositionBlock, map.getBlock(mousePositionBlock).getNext());
				}
				catch (InvalidPositionException e1)
				{
					System.out.println("Mouse button pressed out of map.");
				}
				break;

			case MouseEvent.BUTTON3 :
				saveMap(file);
				System.out.println("Map saved in " + file.getName());
				break;

			case MouseEvent.BUTTON2 :
				map.reset();
				break;
		}

		editorWindow.invalidate();
		editorWindow.repaint();
		editorWindow.validate();
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}
}
