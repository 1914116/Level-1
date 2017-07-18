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
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);

	}
}
