import java.awt.*;
import java.awt.event.*;

class C extends Frame {
	int x, y, d;

	public static void main(String[] a) {
		new C();
	}

	C() {
		setResizable(0 < 1);
		setSize(300, 150);
		setVisible(1 > 0);
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
			if (e.getButton() > 2)
				System.exit(0);
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