package main;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;




// Buttons don't work yet, will add event handling in future




public class Settings extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  // this was imported via Eclipse IDE, not sure what this means but I'll look it up
	private JTextField information;
	private JButton large;
	private JButton medium;
	private JButton small;
	
	public Settings()
	{
		super("Settings");
		
		setLayout ( new FlowLayout());
		
		information = new JTextField("To view to game different size, "
				+ "please press one of the following buttoms");
		information.setEditable(false);
		information.setBackground(Color.BLACK);
		information.setForeground(Color.WHITE);
		add(information, BorderLayout.NORTH);
		
		
		small = new JButton("480 x 220p");
		add(small, BorderLayout.CENTER);
		large = new JButton("800 x 600p");
		add(large, BorderLayout.CENTER);
		medium = new JButton("600 x 410p");
		add(medium, BorderLayout.CENTER);
		
		
		SettingsHandler handler = new SettingsHandler();
		small.addActionListener(handler);
		large.addActionListener(handler);
		medium.addActionListener(handler);
		
	}
	
	private class SettingsHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
		}
	}
}
