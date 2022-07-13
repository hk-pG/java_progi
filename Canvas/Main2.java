import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2 extends JFrame {
	boolean isDrag = false;
	int w = 300, h = 200, x = 0, y = 0;

	public static void main(String[] args) {
		new Main2();
	}

	public void log(String msg) {
		System.out.println(msg);
	}

	Main2() {
		setResizable(false);
		setSize(w, h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(new MouseClick());
		addMouseMotionListener(new MouseMove());
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, w, h);
		if (isDrag) {
			g.drawLine(150, 100, x, y);
		}
	}

	class MouseClick extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			isDrag = true;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			isDrag = false;
			repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
	}

	class MouseMove extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			isDrag = true;
			x = e.getX();
			y = e.getY();
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// x = e.getX();
			// y = e.getY();
			// repaint();
		}
	}
}