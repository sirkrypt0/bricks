import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Block extends JLabel{
	
	public Block() {
		//one block
		
		this.setSize(32,32);
		this.setLocation(512, 205);
		this.setIcon(new ImageIcon("Assets/brick.png")); 
	}
	

}
