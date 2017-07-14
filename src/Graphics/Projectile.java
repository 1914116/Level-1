package Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed;

	public Projectile(int x, int y, int width, int height, int speed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}

	public void update() {
		y -= speed;
		if (y <= 0) {
			isAlive = false;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, 10);
	}
}
