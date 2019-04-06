import java.util.concurrent.TimeUnit;

public class Bricks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gameLoop();
	}
	
	public static void gameLoop() {
		GUI Game = new GUI();
		while(true){
			Game.update();
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
