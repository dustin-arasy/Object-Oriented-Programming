package Session8;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame
{
	JLabel headerLabel = new JLabel("Register");
	
	JPanel centerPanel = new JPanel();
	JLabel nameLabel = new JLabel("Name");
	JLabel passwordLabel = new JLabel("Password");
	JTextField nameField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	
	JPanel footerPanel = new JPanel();
	JButton submitBtn = new JButton("Submit");
	
	public RegisterFrame(){
		add(headerLabel, BorderLayout.NORTH);
		
		centerPanel.setLayout(new GridLayout(2, 2));
		centerPanel.add(nameLabel);
		centerPanel.add(nameField);
		centerPanel.add(passwordLabel);
		centerPanel.add(passwordField);
		add(centerPanel);
		
		footerPanel.add(submitBtn);
		add(footerPanel, BorderLayout.SOUTH);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new RegisterFrame();
	}
}
