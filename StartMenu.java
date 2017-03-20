

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;



public class StartMenu extends JFrame
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;  // this was imported via Eclipse IDE, not sure what this means but I'll look it up
	private JButton startGameBtn;
	private JButton settingsBtn;
	private JButton readMeBtn;
	private GridLayout layout;
	@SuppressWarnings("unused")  // this was imported via Eclipse IDE, not sure what this means but I'll look it up
	private Container container;

	public StartMenu()
	{
		super("Project SLO | By: Joseph Bourne");


		layout = new GridLayout(3, 1, 5, 5);
		container = getContentPane();
		setLayout(layout);



		// I create three buttons and I set color for the text of the button
		// and i set background color for the buttons also

		startGameBtn = new JButton("Start Game");
		startGameBtn.setBackground(new Color(80,40,18));
		startGameBtn.setForeground(Color.WHITE);


		add(startGameBtn);
		settingsBtn = new JButton("Settings");
		settingsBtn.setBackground(new Color(64,70,22));
		settingsBtn.setForeground(Color.WHITE);
		add(settingsBtn);
		readMeBtn = new JButton("Game Rules: HOW TO PLAY");
		readMeBtn.setBackground(new Color(87,82,126));
		readMeBtn.setForeground(Color.WHITE);
		add(readMeBtn);

		setSize(450, 300);
		setVisible(true);

		// Creating inner class for button event handling

		ButtonLink handler = new ButtonLink();
		startGameBtn.addActionListener(handler);
		settingsBtn.addActionListener(handler);
		readMeBtn.addActionListener(handler);

	}

	private class ButtonLink implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == readMeBtn) // if user clicks this button they create
			{								     // an object of GameRules class
				GameRules rules = new GameRules();
				rules.setSize(700,700);
				rules.setVisible(true);

			}

			else if(event.getSource() == settingsBtn) // if user clicks this button they create
			{            							  // an object of Settings class
				Settings gameSettings = new Settings();
				gameSettings.setSize(500,230);
				gameSettings.setVisible(true);

			}

			else if(event.getSource() == startGameBtn) // if user clicks this button they create
			{										     // an object of StartGame class
				StartGame newGame = new StartGame();
				newGame.setSize(555,350);
				newGame.setVisible(true);

			}
		}
	}
}
