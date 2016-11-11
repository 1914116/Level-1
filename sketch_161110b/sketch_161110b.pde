int bx = 50;
int by = 300;
double birdUpDown= 1;
double gravity = 0.65;
int pipeX = 350;
int pipeY = 250;
int xPipe = 350;
int yPipe = 10;
void setup(){
size(400,400);
}
void draw(){
 background(0,0,100);
fill(255,0,0);
ellipse(bx,by,30,30); 
fill(255,255,255);
rect(pipeX, pipeY, 40,150);
pipeX = pipeX-3;
if(pipeX<=10){
  pipeX= 350;
  pipeY = (int) random(50,350);
}
by += birdUpDown;
birdUpDown += gravity;
fill(255,0,0);
rect (xPipe, yPipe, 40,150);
}
void mousePressed(){
if(mousePressed){
 birdUpDown= -10; 
}
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}




  
