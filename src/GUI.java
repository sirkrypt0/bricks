import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	
	private JLabel imageBall = new JLabel(new ImageIcon("Assets/ball.png"));
	private JLabel imageBrick = new JLabel(new ImageIcon("Assets/brick.png"));
	private JFrame MainFrame;
	
	private Bar bar;
	private Block brick;
	
	public GUI() {
		
		MainFrame  = new JFrame("Bricks");
		bar = new Bar();
		brick = new Block();
		
		
		//Ball
		imageBall.setSize(32, 32);
		imageBall.setLocation(512,512);
		
		//Brick
		//imageBrick.setSize(32, 32);
		//imageBrick.setLocation(512, 205);
		
		//MainFrame params
		
		MainFrame.setLayout(null);
		MainFrame.setSize(1024, 1024);
		MainFrame.setResizable(false);
		MainFrame.getContentPane().setBackground(Color.DARK_GRAY);
		MainFrame.setTitle("Bricks");
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainFrame.addKeyListener(bar);
		
		MainFrame.add(bar);
		MainFrame.add(imageBall);
		MainFrame.add(brick);
		//MainFrame.add(imagePlayerBar);
		
		MainFrame.setVisible(true);
	}
	
	public void update() {
		bar.move();
	}

	/*public static void createBricks(int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				bricks[k] = new Block();
			}
		}
	}*/
}