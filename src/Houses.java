import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortoise.getBackgroundWindow();
		Tortoise.setSpeed(10);
		Tortoise.setX(10);
		Tortoise.setY(600);
		Tortoise.turn(90);
		Tortoise.show();
		Tortoise.getBackgroundWindow().setBackground(Color.BLACK);
		drawHouse("m", Colors.getRandomColor());
		Tortoise.setSpeed(10);
		drawHouse("m", Color.GREEN);
		drawHouse("s", Colors.getRandomColor());
		drawHouse("l", Colors.getRandomColor());
		drawHouse("s", Color.red);
		drawHouse("m", Color.cyan);
		drawHouse("l", Color.BLUE);
		drawHouse("l",Color.PINK);
		drawHouse("m", Color.GREEN);
		drawHouse("s", Colors.getRandomColor());
		drawHouse("l", Colors.getRandomColor());
		drawHouse("s", Color.red);
		drawHouse("m", Color.cyan);
		drawHouse("l", Color.BLUE);
		drawHouse("l",Color.PINK);
		drawHouse("m", Color.GREEN);
		drawHouse("s", Colors.getRandomColor());
		drawHouse("m", Color.cyan);
		drawHouse("l", Color.BLUE);
		drawHouse("l", Colors.getRandomColor());
		drawHouse("s", Color.red);
		drawHouse("m", Color.cyan);
		drawHouse("l", Color.BLUE);
		drawHouse("l",Color.PINK);
		drawHouse("m", Color.GREEN);
	}

	private static void drawHouse(String size, Color c)
	{
		int j = 0;
		if(size.equals("s")){
			j = 60;
		}
		else if(size.equals("m")){
			j = 120;
		}
		else if(size.equals("l")){
			j = 250;
		}
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(25);
		Tortoise.setPenColor(c);
		Tortoise.turn(270);
		Tortoise.move(j);
		if(size.equals("s")){
			roof();
		}
		else if(size.equals("m")){
			flatRoof();
		}
		else if(size.equals("l")){
			flatRoof();
		}
		Tortoise.move(j);
		Tortoise.turn(270);
		
	}

	private static void roof() {
		Tortoise.turn(60);
		Tortoise.move(50);
		Tortoise.turn(60);
		Tortoise.move(50);
		Tortoise.turn(60);
	}

	private static void flatRoof() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
	}
}
