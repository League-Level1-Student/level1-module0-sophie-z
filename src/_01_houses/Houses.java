package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot();
public static void main(String[] args) {
	bob.setX(50);
	bob.setY(500);
	bob.setSpeed(100);
	bob.penDown();
	String height = JOptionPane.showInputDialog("How tall do you want the houses to be: small, medium, or large?");
	String color = JOptionPane.showInputDialog("What color do you want the houses to be: red, green, or cyan?");
	for(int i=0; i<10;i++) {
		if(height.equals("large")) {
		drawFlatRoof(height, color);
		}
		else {
			drawHouse(height, color);
		}
		}
	}
static void drawHouse(String height, String color) {
	int tall = 100;
	if(color.equals("red")) {
		bob.setPenColor(Color.red);
	}
	if(color.equals("green")) {
		bob.setPenColor(Color.green);
	}
	else {
		bob.setPenColor(Color.cyan);
	}
	if(height.equals("small")) {
		tall = 60;
	}
	if(height.equals("medium")) {
		tall = 120;
	}
	if(height.equals("large")) {
		tall = 250;
	}
	bob.move(100);
	bob.turn(45);
	bob.move(20);
	bob.turn(90);
	bob.move(20);
	bob.turn(45);
	bob.move(100);
	bob.turn(270);
	bob.move(25);
	bob.turn(270);
}
static void drawFlatRoof(String height, String color) {
	int tall = 100;
	if(color.equals("red")) {
		bob.setPenColor(Color.red);
	}
	if(color.equals("green")) {
		bob.setPenColor(Color.green);
	}
	else {
		bob.setPenColor(Color.cyan);
	}
	if(height.equals("small")) {
		tall = 60;
	}
	if(height.equals("medium")) {
		tall = 120;
	}
	if(height.equals("large")) {
		tall = 250;
	}
	bob.move(tall);
	bob.turn(90);
	bob.move(25);
	bob.turn(90);
	bob.move(tall);
	bob.turn(270);
	bob.move(25);
	bob.turn(270);
}
}

