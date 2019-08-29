import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int ballX = 250;
int ballY = 250;
void setup(){
size(500, 500);
background(#00037E);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
}
void draw(){
fill(#FF0000);
stroke(#000000);
ellipse(ballX+=5, ballY+=5, 10, 10);
background(#00037E);
ellipse(ballX+=5, ballY+=5, 10, 10);
sound.trigger();
rect(mouseX, 460, 70, 40);
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
