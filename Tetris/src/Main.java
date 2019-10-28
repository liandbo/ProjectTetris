import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Main implements ActionListener{
	private JFrame frame;
	JButton playButton, exitButton;
	
	public void JFrameDemo() {
		createAndshow();
	}
	
	public void createAndshow() {
		playButton = new JButton("Play");
		exitButton = new JButton("Exit");
		
		frame = new JFrame("GodPen");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		frame.add(playButton);
		
		frame.add(exitButton);
		exitButton.setActionCommand("Exit");
		exitButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if("Exit".equalsIgnoreCase(e.getActionCommand())) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Main().JFrameDemo();
	}
}
