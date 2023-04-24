package Session8;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ini Frame");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 3));
		JButton btn = new JButton("Click me!");
		centerPanel.add(btn);
		JButton btn1 = new JButton("Click me!");
		centerPanel.add(btn1);
		for (int i = 0; i < 10; i++) {
			centerPanel.add(new JButton("Button" + i));
		}
		frame.add(centerPanel);
		
//		JButton btn = new JButton("Click me!");
//		frame.add(btn);
		
		JLabel label = new JLabel("ini Label");
		frame.add(label, BorderLayout.NORTH);
		
		JTextField textField = new JTextField();
		frame.add(textField, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}

}
