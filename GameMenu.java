import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class GameMenu extends JPanel{
	
	JButton playGameButton;
	JButton viewCardsButton;
	JButton helpButton;
	
	protected GameMenu()
	{
		playGameButton = new JButton("Play Game");
		viewCardsButton = new JButton("View Cards");
		helpButton = new JButton("Help");
		setLayout(new GridLayout(5, 1));
		
		playGameButton.setPreferredSize(new Dimension(200, 200));
		
		add(playGameButton);
		add(viewCardsButton);
		add(helpButton);
	}
}
