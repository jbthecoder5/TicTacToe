

import javax.swing.JOptionPane;

public class Congratulation
{
	public Congratulation()
	{

	}

	public void winningMessage() // displays a message to user that they won the game
	{
		JOptionPane.showMessageDialog(null, "Congratulations! You won. ");
	}

	public void losingMessage()  // displays a message to user that they loss the game
	{
		JOptionPane.showMessageDialog(null, "Sorry you lose the game  :( ");
	}

	public void tiedMessage()
	{
		JOptionPane.showMessageDialog(null, "Game Tied");
	}
}
