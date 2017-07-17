package Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	public Rocketship(int x, int y, int width, int height, int speed) {
		super();
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update() {
		super.update();
		if(up){
			y-=speed;
		}
		if(down){
			y+=speed;
		}
		if(left){
			x-=speed;
		}
		if(right){
			x+=speed;
		}
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
