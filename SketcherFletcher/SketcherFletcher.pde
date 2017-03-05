int birdX = 200;
int birdY = 100;
double birdVelocity = 0;
double gravity = 0.25;
int rectX = 600;
int rectY = 400;
int recth = newRandom();
public void setup() {
  size(600,400);
  
  
}
public void draw() {
  if(intersects(birdX,-1,rectX,rectY,recth)) {
     background(200,130,0);
     System.out.println("YAHHAY");
  }
  background(150,150,150);
  fill(200,130,0);
  ellipse(birdX,birdY,20,20);
  newY();
  
  rect(rectX,-1,50,recth);
  rect(rectX,recth + 100,50,recth * 2);
  rectX -= 3;

  if (rectX < 0) {
    rectX = 600;
    recth = (int) random(100,300);
  }
  
}
public void newY() {
  //birdVelocity += ((birdVelocity * birdVelocity) * gravity) / 50;
  birdVelocity = birdVelocity + gravity;
  birdY += birdVelocity;
  
}
public void mousePressed() {
  birdY -= birdVelocity + birdVelocity * 5;
  birdVelocity = birdVelocity / -2;
  gravity = 0.25;
}
public int newRandom() {
  return (int) random(125,250);
}
boolean intersects(int birdXX, int birdYY, int paddleX, int paddleY, int paddleLength) {
if (birdYY > paddleY - 4 && birdXX > paddleX && birdXX < paddleX + paddleLength)
return true;
else 
return false;
}


