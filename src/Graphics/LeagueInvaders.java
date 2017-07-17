package Graphics;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame game = new JFrame();
	static final int WIDTH = 500;
	static final int height = 800;
	GamePanel gamePanel = new GamePanel();

	public LeagueInvaders() {
		setup();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeagueInvaders LI = new LeagueInvaders();
	}

	public void setup() {
		game.add(gamePanel);
		game.setVisible(true);
		game.addKeyListener(gamePanel);
		game.setSize(WIDTH, height);
		game.setTitle("League Invaders");
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamePanel.startGame();
	}

}
