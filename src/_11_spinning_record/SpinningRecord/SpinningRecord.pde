import ddf.minim.*;             //at the very top of your sketch
PImage myrecord;                       //as member variable
int angle = 0;
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
void setup(){
        size(600,600);                                 //in setup method
        myrecord= loadImage("myrecord.jpg");      //in setup method
        myrecord.resize(height, width);     //in setup method
        minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method

}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
void draw(){
image(myrecord, 2, 2);  //in draw method
if(mousePressed){
rotateImage(myrecord, angle ++);
image(myrecord, 2, 2);  //in draw method
song.play();
}
else{
song.pause();
}
}
