package Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
	public Alien(int x, int y, int height, int width, int speed){
		super();
		this.x=x;
		this.y=y;
		this.height= height;
		this.width = width;
		this.speed = speed;
	}
	public void update(){
		super.update();
		y+= speed;
	}
	public void draw(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
