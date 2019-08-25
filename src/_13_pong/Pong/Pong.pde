int ballX = 250;
void setup(){
size(500, 500);
background(#00037E);
}
void draw(){
fill(#FF0000);
stroke(#000000);
ellipse(ballX+=5, 250, 10, 10);
background(#00037E);
ellipse(ballX+=5, 250, 10, 10);
}
