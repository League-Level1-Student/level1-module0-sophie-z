package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		// 1. Create and initialize an object of the JFrame class
JFrame f = new JFrame();
		// 2. Set your JFrame object to be visible
f.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.

		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Create and initialize an object of the JPanel class
JPanel p = new JPanel();
		// 6. Create and initialize an object of the JLabel class
JLabel l = new JLabel();
		// 7. Set the text of the JLabel to a lovely greeting.
l.setText("Hello, my name is Shane. I hope you will have a good day!");
		// 8. Add the JPanel object to the JFrame
f.add(p);
		// 9. Add the JLabel object to the JPanel
p.add(l);
		// 10. Pack your JFrame.
f.pack();
		// 11. Run your program again. Do you see your message.

		// 12. Use the loadImage method to set the icon of the JLabel object.
loadImage();
		// 13. Re-pack the JFrame object.
f.pack();
		// 14. Run the program one more time. Do you see the image?

	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {

			return null;
		}
	}
}
