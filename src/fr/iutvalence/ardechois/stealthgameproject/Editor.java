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

	/**
	 * Default constructor.
	 */
	public Editor()
	{
		try
		{
			this.map = new Map("map2.txt");
			this.editorWindow = new EditorWindow(map, this);
		} catch (InvalidMapSizeException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setBlock(Position position, Blocks block)
	{
		try
		{
			map.setBlock(position, block);
		} catch (InvalidPositionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Save the edited map in a target file.
	 * 
	 * @param file
	 * 			The target file in which the map will be saved.
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
		// TODO debug
		System.out.println("(" + e.getX()/EditorWindow.PREFERRED_BLOCK_SIZE + ";" + e.getY()/EditorWindow.PREFERRED_BLOCK_SIZE + ")");
		
		Position mousePositionBlock = new Position(e.getX()/EditorWindow.PREFERRED_BLOCK_SIZE, e.getY()/EditorWindow.PREFERRED_BLOCK_SIZE);
		try
		{
			map.setBlock(mousePositionBlock, Blocks.WALL);
		} catch (InvalidPositionException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
