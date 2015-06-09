package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import fr.iutvalence.ardechois.stealthgameproject.Editor;
import fr.iutvalence.ardechois.stealthgameproject.controller.SGPController;

public class ActionLaunch extends AbstractAction {
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private ActionType actionType;
	private JFrame frame;
	
	public ActionLaunch(ActionType actionType, JFrame frame) {
		this.actionType = actionType;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		
		switch(this.actionType)
		{
		case PLAY:
			SGPController game = new SGPController();
			break;
		case EDITOR:
			Editor editor = new Editor();
			break;
		default:
			
			break;
		}
	}

}
