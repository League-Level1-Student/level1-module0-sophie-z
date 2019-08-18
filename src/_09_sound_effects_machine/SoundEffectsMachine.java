package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffectsMachine implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
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
		JButton button1clicked = 
				playSound1("dogbark.wav");
		JButton button2clicked = 
				playSound2("meow.wav");
		JButton button3clicked = 
				playSound3("moo.wav");
	}
}
