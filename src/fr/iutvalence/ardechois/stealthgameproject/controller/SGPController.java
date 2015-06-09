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
	// TODO Javadoc ;)
	private SGPModel model;

	// TODO Javadoc ;)
	private SGPView view;

	// TODO Javadoc ;)
	public HashMap<String, Direction> directionHashMap;

	// TODO Javadoc ;)
	public SGPController()
	{
		setHashMap();
		this.model = new SGPModel();
		this.view = new SGPView(model.getLevel(), model.getLevel().getCurrentMap(), model.getPlayer(), this);
	}
	
	// TODO Javadoc ;)
	private void setHashMap()
	{
		this.directionHashMap = new HashMap<String, Direction>();
		this.directionHashMap.put("UP", Direction.UP);
		this.directionHashMap.put("DOWN", Direction.DOWN);
		this.directionHashMap.put("LEFT", Direction.LEFT);
		this.directionHashMap.put("RIGHT", Direction.RIGHT);
	}
	
	// TODO Javadoc ;)
	public void move(Direction direction)
	{
		model.move(direction);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}
	
	@Override
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
	
	@Override
	@Deprecated
	public void keyReleased(KeyEvent e)
	{
		// TODO Useless ;)

	}
}
