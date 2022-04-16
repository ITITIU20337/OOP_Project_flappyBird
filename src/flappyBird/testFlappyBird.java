package flappyBird;

import java.awt.Image;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.JFrame;

public class testFlappyBird implements KeyListener{
	
	private JFrame jFrame;
	
	public void setMainFrame() {
		jFrame = new JFrame("Flappy Bird");
		
		jFrame.setSize(550, 700);
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);

		URL urlBackground = testFlappyBird.class.getResource("/image/birdIcon.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlBackground);
		jFrame.setIconImage(img);;
		
		DrawComponent panel = new DrawComponent();
		jFrame.add(panel);	
	}

	public static void main(String[] args) {
		new testFlappyBird().setMainFrame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
