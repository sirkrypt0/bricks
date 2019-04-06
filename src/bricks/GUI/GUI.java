import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	
	private JLabel imageBall = new JLabel(new ImageIcon("Assets/ball.png"));
	private JLabel imagePlayerBar = new JLabel(new ImageIcon("Assets/playerBar.png"));
	private JLabel imageBrick = new JLabel(new ImageIcon("Assets/brick.png"));
	
	public GUI() {
		//Ball
		imageBall.setSize(32, 32);
		imageBall.setLocation(512,512);
		
		//PlayerBar
		imagePlayerBar.setSize(32,32);
		imagePlayerBar.setLocation(512, 922);
		
		//Brick
		imageBrick.setSize(32, 32);
		imageBrick.setLocation(512, 205);
		
		//MainFrame params
		JFrame MainFrame = new JFrame("Bricks");
		
		MainFrame.setLayout(null);
		MainFrame.setSize(1024, 1024);
		MainFrame.setResizable(false);
		MainFrame.getContentPane().setBackground(Color.DARK_GRAY);
		MainFrame.setTitle("Bricks");
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.add(imageBall);
		MainFrame.add(imageBrick);
		MainFrame.add(imagePlayerBar);

		
		MainFrame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GUI();
	}
	

}