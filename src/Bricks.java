import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Bricks {
	
	// 60 fps
	public static int delay = 1000/60;
	private static GUI gui;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui = new GUI();
		final Timer timer = new Timer(Bricks.delay, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gameLoop();
			}});
		timer.start();
	}
	
	public static void gameLoop() {
		gui.update();
	}

}
