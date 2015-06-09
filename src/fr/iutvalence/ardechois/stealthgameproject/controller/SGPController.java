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
		int key = e.getKeyCode();

		switch (key)
		{
			case KeyEvent.VK_UP :
				this.model.move(Direction.UP);
				break;

			case KeyEvent.VK_DOWN :
				this.model.move(Direction.DOWN);
				break;

			case KeyEvent.VK_LEFT :
				this.model.move(Direction.LEFT);
				break;

			case KeyEvent.VK_RIGHT :
				this.model.move(Direction.RIGHT);
				break;
		}
		
		this.view.updateWindow();
	}

	public void keyReleased(KeyEvent e)
	{
		// TODO Useless ;)

	}
}
