import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Bar extends JLabel implements KeyListener{
	
	private int speed = 10;
	private int velX = 0;
	
	public Bar() {
		//PlayerBar
		this.setSize(64,32);
		this.setLocation(512, 922);
		this.setIcon(new ImageIcon("Assets/playerBar.png")); 
		
	}
	
	public void move() {
		int x = this.getX();
		int maxX = 1024 - 74;
		int minX = speed;
		
		if(x < minX) {
			x = minX;
		}
		else if(x > maxX) {
			x = maxX;
		}
		
		if(x > minX && velX < 0 || x < maxX && velX > 0 )
			this.setLocation(x+velX, this.getY());

	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		
		int key = event.getKeyCode();
		
		
		switch(key){
			case KeyEvent.VK_LEFT:
				velX = -speed;
				break;
			case KeyEvent.VK_RIGHT:
				velX = speed;
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		velX = 0;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
