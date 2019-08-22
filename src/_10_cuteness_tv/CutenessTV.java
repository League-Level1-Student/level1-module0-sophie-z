package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JButton Ducks = new JButton("Ducks");
	JButton Frog = new JButton("Frog");
	JButton FluffyUnicorns = new JButton("Fluffy Unicorns");
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	     }
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.add(Ducks);
		panel.add(Frog);
		panel.add(FluffyUnicorns);
		frame.add(panel);
		frame.pack();
		Ducks.addActionListener(this);
		Frog.addActionListener(this);
		FluffyUnicorns.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) e.getSource();
			if(buttonclicked == Ducks) {
				showDucks();
			}
			else if(buttonclicked == Frog) {
				showFrog();
			}
			else if(buttonclicked == FluffyUnicorns) {
				showFluffyUnicorns();
			}
	}
}
