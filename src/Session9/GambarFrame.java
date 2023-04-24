package Session9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GambarFrame extends JFrame {
	
	DrawPanel panel = new DrawPanel();
	GambarFrame() {
		add(panel);
		panel.repaint();
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GambarFrame();
	}
}


class DrawPanel extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		repaint();
	}
	
	int x = 2;
	int y = 2;
	
	void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.GREEN);
		g2d.fillRect(x * 20, y * 20, 20, 20);
	}
}
