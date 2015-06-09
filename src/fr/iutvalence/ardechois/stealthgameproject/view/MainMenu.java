package fr.iutvalence.ardechois.stealthgameproject.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {
	/**
	 * MainMenu for the game.
	 */
	private static final long serialVersionUID = 1L;

	public MainMenu() {
		this.setTitle("Stealth Game Project");
		this.setSize(808, 670);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    
	    this.setLayout(new FlowLayout(FlowLayout.CENTER,808,70));
	    
	    JLabel title=new JLabel("Stealth Game Project");
	    title.setHorizontalAlignment(SwingConstants.CENTER);
	    title.setFont(new Font("Linux", Font.PLAIN, 50));
	    this.getContentPane().add(title, BorderLayout.NORTH);
	    
	    JButton play=new JButton(new ActionLaunch(ActionType.PLAY, this));
	    play.setText("Play");
	    play.setPreferredSize(new Dimension(200,50));
	    play.setHorizontalAlignment(SwingConstants.CENTER);
	    play.setFont(new Font("Linux", Font.PLAIN, 20));
	    this.getContentPane().add(play,BorderLayout.CENTER);
	    
	    JButton editor=new JButton(new ActionLaunch(ActionType.EDITOR, this));
	    editor.setText("Editor");
	    editor.setPreferredSize(new Dimension(200,50));
	    editor.setHorizontalAlignment(SwingConstants.CENTER);
	    editor.setFont(new Font("Linux", Font.PLAIN, 20));
	    this.getContentPane().add(editor,BorderLayout.CENTER);
	    
	    JButton quit=new JButton(new ActionLaunch(ActionType.QUIT, this));
	    quit.setText("Quit");
	    quit.setPreferredSize(new Dimension(200,50));
	    quit.setHorizontalAlignment(SwingConstants.CENTER);
	    quit.setFont(new Font("Linux", Font.PLAIN, 20));
	    this.getContentPane().add(quit,BorderLayout.CENTER);

	    }
}	
