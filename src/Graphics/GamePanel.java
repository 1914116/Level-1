package Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Font titleFont;
	Font startFont;
	Font instructions;
	Rocketship ship;
	ObjectManager manager;
	int intscore;
	String yourscore;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		startFont = new Font("Arial", Font.PLAIN, 24);
		instructions = new Font("Arial", Font.PLAIN, 24);
		ship = new Rocketship(225, 700, 50, 50, 5);
		manager = new ObjectManager();
		manager.addObject(ship);
	}

	public void startGame() {
		timer.start();
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		manager.update();
		manager.checkCollision();
		if(ship.isAlive==false){
			currentState= END_STATE;
		}
		intscore = manager.getScore();
		yourscore = Integer.toString(intscore);
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 850);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 25, 200);
		g.setFont(startFont);
		g.drawString("Press ENTER to Start", 125, 300);
		g.setFont(instructions);
		g.drawString("Press TAB for instructions", 85, 400);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		manager.draw(g);
		manager.manageEnemies();
		g.setFont(instructions);
		g.drawString(yourscore, 450, 50);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 100, 100);
		g.setFont(startFont);
		g.drawString("That was pitiful. You only killed " + yourscore + " aliens.", 30, 300);
		g.setFont(instructions);
		g.drawString("Press BACKSPACE to Restart.", 70, 500);
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();

		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (currentState == END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_TAB) {
			JOptionPane.showMessageDialog(null, "Use arrow keys to move. Press SPACE to fire. Try not to die by avoiding the aliens.");
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(ship.x + 25, ship.y, 10, 10, 10));
		}
		if(e.getKeyCode() == KeyEvent.VK_9){
			manager.addObject(new Projectile(ship.x+25, ship.y, 150, 100, 25));
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up=true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down=true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right=true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up=false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down=false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right=false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left=false;
		}
	}

}
