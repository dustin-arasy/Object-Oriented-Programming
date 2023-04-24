package Session9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener, WindowListener, MouseListener, MouseMotionListener {
	
	public static void main(String[] args) {

		new MainFrame();
	}
	
	private JButton btn = new JButton("Click me!");
	private JButton btn2 = new JButton("Footer");
	private JButton btn3 = new JButton("Header");
	
	private int count = 0;
	private ActionListener actionBtn3 = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "ini Header");
			count++;
			btn3.setText("Header " + count);
		}
	};
	
	public MainFrame() {
		btn.addActionListener(this);
		btn.addMouseMotionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(actionBtn3);
		add(btn);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.NORTH);
		
		addWindowListener(this);
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Click");
		if(e.getSource() == btn) {
			JOptionPane.showMessageDialog(null, "Hello World!");
			int res = JOptionPane.showConfirmDialog(null, "Yakin Kah?");
			String result = JOptionPane.showInputDialog("Masukkan nama");
			System.out.println("Nama " + result + "\nButton" + res);
		} else if(e.getSource() == btn2) {
			JOptionPane.showMessageDialog(this, "Ini Footer");
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window closing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window deactivated");
		
	}
	
	//MOUSE MOTION LISTENER
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("X: " + e.getX() + ", Y: " + e.getY());
		
	}
	
	//MOUSE LISTENER
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
