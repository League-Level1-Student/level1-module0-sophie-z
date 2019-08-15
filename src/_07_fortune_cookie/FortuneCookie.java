package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{ 
public void showJFrame() {
	System.out.println("Button clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	int rand = new Random().nextInt(5);
if(rand == 0) {
	JOptionPane.showMessageDialog(null, "Oh no. You get sucked up in a tornado and you die. Oops.");
}
if(rand == 1) {
	JOptionPane.showMessageDialog(null, "Oh no. You get caught in a car 'accident.' You die. Whoopsie daisies.");
}
if(rand == 2) {
	JOptionPane.showMessageDialog(null, "You hear what the winning lottery number is, and then one day you find a lottery ticket in your house. You win!");
}
if(rand == 3) {
	JOptionPane.showMessageDialog(null, "You walk into a pole and fall into a coma. Idiot.");
}
if(rand == 4) {
	JOptionPane.showMessageDialog(null, "You are walking across the street one day when a drunk driver runs you over. You die.");
}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
