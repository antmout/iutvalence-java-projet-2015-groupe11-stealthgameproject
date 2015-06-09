package fr.iutvalence.ardechois.stealthgameproject.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import fr.iutvalence.ardechois.stealthgameproject.model.Direction;
import fr.iutvalence.ardechois.stealthgameproject.model.SGPModel;
import fr.iutvalence.ardechois.stealthgameproject.view.SGPView;

/**
 * @author antoine
 *
 */
public class SGPController implements KeyListener
{
	private SGPModel model;
	private SGPView view;

	public HashMap<String, Direction> directionHashMap;

	public SGPController()
	{
		setHashMap();
		this.model = new SGPModel();
		this.view = new SGPView(model.getLevel().getCurrentMap(), model.getPlayer(), this);
	}

	private void setHashMap()
	{
		this.directionHashMap = new HashMap<String, Direction>();
		this.directionHashMap.put("UP", Direction.UP);
		this.directionHashMap.put("DOWN", Direction.DOWN);
		this.directionHashMap.put("LEFT", Direction.LEFT);
		this.directionHashMap.put("RIGHT", Direction.RIGHT);
	}

	public void move(Direction direction)
	{
		model.move(direction);
	}

	// STARTING DEVELOPMENT OF THE KEYBOARD MANAGER \\

	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e)
	{
		System.out.println("test");
		int key = e.getKeyCode();

		switch (key)
		{
			case KeyEvent.VK_UP :
				System.out.println("Move up");
				// TODO
				break;

			case KeyEvent.VK_DOWN :
				System.out.println("Move down");
				// TODO
				break;

			case KeyEvent.VK_LEFT :
				System.out.println("Move left");
				// TODO
				break;

			case KeyEvent.VK_RIGHT :
				System.out.println("Move right");
				// TODO
				break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();

		switch (key)
		{
			case KeyEvent.VK_UP :
				System.out.println("Stop moving up");
				// TODO
				break;

			case KeyEvent.VK_DOWN :
				System.out.println("Stop moving down");
				// TODO
				break;

			case KeyEvent.VK_LEFT :
				System.out.println("Stop moving left");
				// TODO
				break;

			case KeyEvent.VK_RIGHT :
				System.out.println("Stop moving right");
				// TODO
				break;

		}

	}
}
