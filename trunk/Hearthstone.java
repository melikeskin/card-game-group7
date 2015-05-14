import javax.swing.JFrame;


public class Hearthstone {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GameMenu gameMenu = new GameMenu();

		frame.setTitle("Hearthstone");
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.add(gameMenu);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
