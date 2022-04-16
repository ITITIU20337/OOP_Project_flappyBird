package flappyBird;

import java.awt.Graphics;


import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class DrawComponent extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		ImageIcon img = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(testFlappyBird.class.getResource("/image/background.png")));
		g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
		
		ImageIcon img3 = new ImageIcon(Toolkit.getDefaultToolkit().createImage(testFlappyBird.class.getResource("/image/ground.png")));
		g.drawImage(img3.getImage(), -20, 550, 600, 200, null);


	}
}
