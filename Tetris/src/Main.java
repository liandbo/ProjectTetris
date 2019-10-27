import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Main{
	private JFrame frame;
	JButton button;
	
	public void JFrameDemo() {
		createAndshow();
	}
	
	public void createAndshow() {
		button = new JButton("OK");
		frame = new JFrame("GodPen");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Main().JFrameDemo();;
	}
}
