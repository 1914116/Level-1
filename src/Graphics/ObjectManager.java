package Graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager  {
	ArrayList<GameObject> objects;

	private int score = 0;
	Alien alien2;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	public ObjectManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}

		purgeObjects();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
		if(score>=150){
			
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}

	 public void manageEnemies(){
		 if(score==25){
			 addObject(new Alien(new Random().nextInt(LeagueInvaders.WIDTH),0, 75, 75, 1));
		 }
		 if(score>=15 && score<=200){
			 addObject(new Alien(new Random().nextInt(LeagueInvaders.WIDTH),0, 100, 100, 1)); 
		 }
		 if(score>=250){
			 alien2 = new Alien(new Random().nextInt(LeagueInvaders.WIDTH),0, 150, 150, 1);
			 addObject(alien2);
		 }
		 if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	 addObject(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50, 2));
	 enemyTimer = System.currentTimeMillis();
	 }
	 }
	
	 public void checkCollision() {
		  for (int i = 0; i < objects.size(); i++) {
	 for (int j = i + 1; j < objects.size(); j++) {
	 GameObject o1 = objects.get(i);
	 GameObject o2 = objects.get(j);
	
	 if(o1.collisionBox.intersects(o2.collisionBox)){
	 if((o1 instanceof Alien && o2 instanceof Projectile) ||
	 (o2 instanceof Alien && o1 instanceof Projectile)){
	 score++;
	 System.out.println(score);
	 o1.isAlive = false;
	 o2.isAlive = true;
	 }
	 else if((o1 instanceof Alien && o2 instanceof Rocketship) ||
	 (o2 instanceof Alien && o1 instanceof Rocketship)){
	 o1.isAlive = true;
	 o2.isAlive = false;
	 }	
	 }
	 }
	 }
	 }

	public int getScore() {
		return score;
	}

	public void setScore(int s) {
		score = s;
	}

	public void reset() {
		objects.clear();
	}
}