int rainY = 0;
int rainX;
int score = 0;
void setup(){
size(500, 500);
}
void draw(){
background(#00DBFF);
fill(#D3D3D3);
stroke(#D3D3D3);
ellipse(rainX, rainY +=3, 7, 10);
if(rainY > 470){
checkCatch(rainX);
rainX = (int) random(width);
rainY = 0;
ellipse(rainX, rainY +=3, 6, 20);
}
rect(mouseX, 470, 50, 30);
fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
