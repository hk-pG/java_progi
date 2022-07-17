import java.awt.*;
import java.awt.event.*;

class C extends Frame {
	int d, r = 300;
	MouseEvent E;
	MouseAdapter M = new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
			d = 0;
			if (e.getButton() > 2)
				System.exit(0);
		}

		public void mouseDragged(MouseEvent e) {
			d = 1;
			E = e;
		}
	};

	public static void main(String[] a) {
		new C();
	}

	C() {
		setResizable(0 > 1);
		setSize(r, r);
		setVisible(1 > 0);
		addMouseListener(M);
		addMouseMotionListener(M);
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, r, r);
		if (d > 0)
			g.drawLine(r / 2, r / 2, E.getX(), E.getY());
		repaint();
	}
}
