import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MImage extends JPanel implements ActionListener {

	Timer t = new Timer(10, this);
	int x = 0, y = 0, velX = 2, velY = 2;
	Image image;
	int num = 0;
	// ImageIcon [] image1 = new ImageIcon[2];

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		ImageIcon i = new ImageIcon("image/cartoon.jpg");
		image = i.getImage();
		g.drawImage(image, x, y, null);
		t.setRepeats(true);
		t.start();

	}

	public void actionPerformed(ActionEvent e) {

		num = num + 1;
		if (num % 100 == 0) {
			x = x + 1;
		}

		if (num % 100 == 0) {
			y = y + 1;

		}

//		if (x < 0 || x >= 1500) {
//			velX = -velX;
//		}
//
//		if (y < 0 || y >= 3000) {
//			velY = -velY;
//		}

//		if(x < 0 || x > 560) {
//			velX = -velX;
//		}
//		if(y < 0 || y > 360) {
//			velY = -velY;
//		}

		x += velX;
		y += velY;
		repaint(x);
	}

}
