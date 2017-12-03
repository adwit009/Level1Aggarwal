void setup() {
size(500, 500);
 background(255, 255, 255);
}
float x;
float y;
float r;
float g;
float b;
int h = 1;
void draw () {

  for (int i = 0; i<h; i++) {
x = random(500);
y = random(500);
r = random(255);
g = random(255);
b = random(255);
 fill(r,g,b);
  ellipse (getWormX(i) , getWormY(i), 20,20);
noStroke();

}
makeMagical();
}
float frequency = .01;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
void mouseClicked() {
h++;
}