package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton("Dog");
	JButton button2 = new JButton("Cat");
	JButton button3 = new JButton("Cow");
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public static void main(String[] args) {
		
	}
	private void playSound1(String dogbark) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource("dogbark.wav")); 
	    sound.play();
	}
	private void playSound2(String meow) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource("meow.wav")); 
	    sound.play();
	}
	private void playSound3(String moo) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource("moo.wav")); 
	    sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
			if(buttonclicked == button1) {
				playSound1("dogbark.wav");
			}
			else if(buttonclicked == button2) {
				playSound1("meow.wav");
			}
			else if(buttonclicked == button3) {
				playSound1("moo.wav");
			}
	}
}
