import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class C extends JFrame {
	int x, y, d;

	public static void main(String[] a) {
		new C();
	}

	C() {
		setResizable(false);
		setSize(300, 150);
		setDefaultCloseOperation(3);
		setVisible(true);
		addMouseListener(new m());
		addMouseMotionListener(new m());
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 300, 150);
		if (d > 0)
			g.drawLine(150, 100, x, y);
		repaint();
	}

	class m extends MouseAdapter {

		public void mousePressed(MouseEvent e) {
			d = 1;
		}

		public void mouseReleased(MouseEvent e) {
			d = 0;
		}

		public void mouseDragged(MouseEvent e) {
			d = 1;
			x = e.getX();
			y = e.getY();
		}
	}
}