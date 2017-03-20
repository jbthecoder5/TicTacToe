 

import java.util.Random;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StartGame extends JFrame implements ActionListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JButton box[];
	@SuppressWarnings("unused")
	private Container container;
	private GridLayout layout;
	private static final Random random = new Random();
	private int rand;
	private static final String names[] =
	{
		" ", " ", " ", " ", " ",
		" ", " ", " ", " "
	};

	private boolean won = false;  // game is not won, set to false by default
	public StartGame()
	{
		super("Project SLO |  By: Joseph Bourne");

		layout = new GridLayout(3, 3, 20, 20);
		container = getContentPane();
		setLayout(layout);

		box = new JButton[names.length];

		// adding all 8 box buttons to the grid layout
		for(int i = 0; i < names.length; i++)
		{
			box[i] = new JButton(names[i]);
			box[i].addActionListener(this);
			add(box[i]);
		}
	}

	// this method (from lines 54 - 374 ) is used to determine which button the user clicked. by setting "x" or "o".
	// I plan to change this in the future to have the AI recognize if JButton was set to image/icon
	public void actionPerformed(ActionEvent event)
	{

		if(event.getSource() == box[0])
		{
			box[0].setText("X");
			box[0].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[0].setEnabled(false);

			if(box[0].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[0].getText() == "X" &&
			   box[3].getText() == "X" &&
			   box[6].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[3].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[0].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[2].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[0].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}
		}


		else if(event.getSource() == box[1])
		{
			box[1].setText("X");
			box[1].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[1].setEnabled(false);

			if(box[0].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[2].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[1].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[7].getText() == "X" ||
			   box[7].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[1].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}
		}


		else if(event.getSource() == box[2])
		{
			box[2].setText("X");
			box[2].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[2].setEnabled(false);

			if(box[0].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[2].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[1].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[5].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[5].getText() == "X" &&
			   box[2].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}
		}


		else if(event.getSource() == box[3])
		{
			box[3].setText("X");
			box[3].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[3].setEnabled(false);

			if(box[3].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[5].getText() == "X" ||
			   box[5].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[3].getText() == "X" ||
			   box[0].getText() == "X" &&
			   box[3].getText() == "X" &&
			   box[6].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[3].getText() == "X" &&
			   box[0].getText() == "X")
			{
				won = true;
				gameWonStatus(won);

			}

			else
			{
				computerTurn();
			}

		}


		else if(event.getSource() == box[4])
		{
			box[4].setText("X");
			box[4].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[4].setEnabled(false);

			if(box[0].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[3].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[5].getText() == "X" ||
			   box[5].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[3].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[6].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[2].getText() == "X")
			 {
			     won = true;
				 gameWonStatus(won);
			 }

			 else
			 {
				computerTurn();
			 }
		}


		else if(event.getSource() == box[5])
		{
			box[5].setText("X");
			box[5].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[5].setEnabled(false);

			if(box[5].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[6].getText() == "X" ||
			   box[5].getText() == "X" &&
			   box[6].getText() == "X" &&
			   box[4].getText() == "X" ||
			   box[2].getText() == "X" &&
			   box[5].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[5].getText() == "X" &&
			   box[2].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}

		}


		else if(event.getSource() == box[6])
		{
			box[6].setText("X");
			box[6].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[6].setEnabled(false);

			if(box[6].getText() == "X" &&
			   box[7].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[2].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[3].getText() == "X" &&
			   box[0].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}		}


		else if(event.getSource() == box[7])
		{
			box[7].setText("X");
			box[7].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[7].setEnabled(false);

			if(box[7].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[1].getText() == "X" ||
			   box[1].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[7].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}
		}


		else if(event.getSource() == box[8])
		{
			box[8].setText("X");
			box[8].setIcon(new ImageIcon(getClass().getResource("x.png")));
			box[8].setEnabled(false);

			if(box[0].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[4].getText() == "X" &&
			   box[0].getText() == "X" ||
			   box[6].getText() == "X" &&
			   box[7].getText() == "X" &&
			   box[8].getText() == "X" ||
			   box[8].getText() == "X" &&
			   box[7].getText() == "X" &&
			   box[6].getText() == "X")
			{
				won = true;
				gameWonStatus(won);
			}

			else
			{
				computerTurn();
			}
		}
	}


	// methods for computer to play against the user


	public void computerTurn()
	{
		rand = 0 + random.nextInt(9);
		box[rand].setText("O");
		box[rand].setIcon(new ImageIcon(getClass().getResource("o.png")));
		box[rand].setEnabled(false);

		if(box[0].getText() == "O" &&
		   box[1].getText() == "O" &&
		   box[2].getText() == "O" ||
		   box[2].getText() == "O" &&
		   box[1].getText() == "O" &&
		   box[0].getText() == "O" ||
		   box[3].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[5].getText() == "O" ||
		   box[5].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[3].getText() == "O" ||
		   box[6].getText() == "O" &&
		   box[7].getText() == "O" &&
		   box[8].getText() == "O" ||
		   box[0].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[8].getText() == "O" ||
		   box[8].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[0].getText() == "O" ||
		   box[2].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[6].getText() == "O" ||
		   box[6].getText() == "O" &&
		   box[4].getText() == "O" &&
		   box[2].getText() == "O")
		{
			won = false;
			gameWonStatus(won);
		}
	}


	// this method instantiate an object of the congratulations class
	// also, it alerts the user when they win, lose, or tie in-game
	public void gameWonStatus(boolean gameStatus)
	{
		this.won = gameStatus;

		if(gameStatus == true)
		{
			Congratulation application = new Congratulation();
			application.winningMessage();
			int reply = JOptionPane.showConfirmDialog(null, "Quit game?", "Do you wish to quit the game",
					JOptionPane.YES_NO_OPTION);

				if(reply == JOptionPane.YES_OPTION)
				{
					System.exit(0); // exits the entire program
				}
				else if(reply == JOptionPane.NO_OPTION)
				{
					dispose(); // closing current window
				}


		}

		else if(gameStatus == false)
		{
			Congratulation application = new Congratulation();
			application.losingMessage();

			dispose();
		}



		// change below later

	/*	  else if(gameStatus != false || gameStatus != true)  // boolean/logic error
		{
			try
			{
				JOptionPane.showMessageDialog(null, "Error Issue", "You did not win/lose/tie in the previous game",
						JOptionPane.INFORMATION_MESSAGE);
			}

			catch(Exception e1)
			{
				System.err.println("Logic error");
				System.exit(0);
			}

			finally
			{
				System.out.println("Sorry for the inconvenience");
			}
		}     */

		else if(gameStatus != false && gameStatus != true)
		{
			Congratulation application = new Congratulation();
			application.tiedMessage();

			JOptionPane.showMessageDialog(null, "unknown error");
			System.exit(0);
		}

	}
}
