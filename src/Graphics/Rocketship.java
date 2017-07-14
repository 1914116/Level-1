package Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	public Rocketship(int x, int y, int width, int height, int speed) {
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {

	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 50, 50);
	}

	public void up() {
		y -= speed;
	}

	public void down() {
		y += speed;
	}

	public void right() {
		x += speed;
	}

	public void left() {
		x -= speed;
	}
}
