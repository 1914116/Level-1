package Graphics;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int speed;
	boolean isAlive;
	Rectangle collisionBox;

	public GameObject() {
		isAlive = true;
		collisionBox = new Rectangle(x, y, width, height);
	}

	public void update() {

	}

	public void draw(Graphics g) {

	}
}
