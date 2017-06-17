int y = 200;
int birdYVelocity =3;
int pipeX =375;
int pipeY =225;
int pipeIX = 375;
int pipeIY = 400;
int T = 0;
void setup() {
  size(500, 500);
}
void draw() {
  background(50, 50, 50);
  fill(0, 150, 0);
  int x = 250;
  y= y+birdYVelocity;
  ellipse(x, y, 75, 75);
  fill(0, 100, 0);
  rect(pipeX, pipeY, 75, 400);
  pipeX= pipeX -5;
  if (pipeX<=0) {
    pipeX=400;
    pipeY= (int) random(50, 400);
  }
  if (intersects(x, y, pipeX, pipeY, 75, 400)) {
    System.exit(0);
  }
  fill(0, 100, 0);
  rect(pipeIX, 0, 75, pipeIY);  
  pipeIX= pipeIX -5;
  if (pipeIX <= 0) {
    pipeIX = 400;
    T++;
  }
  if(y<=0){
   System.exit(0); 
  }
  if(x>=500){
   System.exit(0); 
  }
  pipeIY= pipeY-190;
  if (intersects(x,y,pipeIX,0,75,pipeIY)) {
    System.exit(0);
  }
 fill(255,255,255);
 textSize(32);
text(T, 250, 50);

}
void mousePressed() {
  y=y-150;
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength, int paddleHeight) {
  if (birdY > paddleY - 4 && birdY < paddleY + paddleHeight && birdX > paddleX && birdX < paddleX + paddleLength)
    return true;
  else 
    return false;
}

