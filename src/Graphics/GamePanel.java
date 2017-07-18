package Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	final int WIN_STATE = 3;
	int currentState = MENU_STATE;
	int rw = 50;
	int rh = 50;
	int pw = 20;
	int ph = 20;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	public static BufferedImage spaceImg;

	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		startFont = new Font("Arial", Font.PLAIN, 24);
		instructions = new Font("Arial", Font.PLAIN, 24);
		ship = new Rocketship(225, 700, rw, rh, 5);
		manager = new ObjectManager();
		manager.addObject(ship);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startGame() {
		timer.start();
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		manager.update();
		manager.checkCollision();
		intscore = manager.getScore();
		if(ship.isAlive==false){
			currentState= END_STATE;
			manager.reset();
			ship = new Rocketship(225, 700, rw,rh,5);
			manager.addObject(ship);
			manager.setScore(0);
		}
		yourscore = Integer.toString(intscore);
		if(manager.getScore()==300){
			currentState = END_STATE;
		}
		if(manager.getScore()>=200){
			pw = 75;
			ph = 75;
			rw = 20;
			rh = 20;
		}
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
		g.drawString("Press TAB for instructions", 100, 400);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawImage(spaceImg, 0,0, 500, 800, Color.BLACK, null);
		manager.draw(g);
		manager.manageEnemies();
		g.setColor(Color.RED);
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
		g.drawString("Better luck next time. You only killed " + yourscore + " aliens.", 15, 300);
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
			manager.addObject(new Projectile(ship.x + 25, ship.y, pw, ph, 10));
		}
		if(e.getKeyCode() == KeyEvent.VK_9){
			manager.addObject(new Projectile(ship.x-50, ship.y, 150, 150, 25));
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
		if (e.getKeyCode() == KeyEvent.VK_2) {
			manager.addObject(new Projectile(ship.x + 25, ship.y, pw, ph, 10));
			manager.addObject(new Projectile(ship.x - 25, ship.y, pw, ph, 10));
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			manager.addObject(new Projectile(ship.x - 25, ship.y, pw, ph, 10));
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
