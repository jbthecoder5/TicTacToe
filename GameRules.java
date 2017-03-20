

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;


public class GameRules extends JFrame
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// private JTextField rules;
	// private JTextField footer;
	//  private JTextField header;


	private JTextField ruleBox;
	private GridLayout grid1;

	/**
	 *  default constructor
	 */
	public GameRules()
	{

		super("Rules for the game");
		grid1 = new GridLayout(2,2);
		setLayout(grid1);


















		/*
		header = new JTextField("Rules for the Tic Tac Toe Game");
		header.setEditable(false);
		add(header, BorderLayout.NORTH);

		rules = new JTextField("The rules for this tic tac toe game\n" +
			"generally applies to any other tic tac toe game. Simply get" +
			"3 'X' in horizontal or vertical line/row and you win");
		rules.setEditable(false);
		add(rules, BorderLayout.CENTER);

		footer = new JTextField("This program was created by Joseph Bourne!"
			+ "\nEnjoy :)");
		footer.setBackground(Color.BLUE);
		footer.setEditable(false);

		add(footer, BorderLayout.SOUTH);
		*/


	}
}
