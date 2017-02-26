int birdX = 200;
int birdY = 100;
double birdVelocity = 2;
double gravity = 0.25;
public void setup() {
  size(600,400);
  
}
public void draw() {
  background(150,150,150);
  fill(200,130,0);
  ellipse(birdX,birdY,20,20);
  newY();
}
public void newY() {
  birdVelocity += ((birdVelocity * birdVelocity) * gravity) / 50;
  birdY += birdVelocity;
  
}
public void mousePressed() {
  birdY -= birdVelocity + birdVelocity;
  gravity = 0;
}

