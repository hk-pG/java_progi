import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Main
 */
public class Main extends Frame {
	DrawCanvas c;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		setLayout(new FlowLayout());
		add(c = new DrawCanvas());
		setSize(getPreferredSize());
		setVisible(true);
	}
}

class DrawCanvas extends Canvas {
	DrawCanvas() {
		super();
		setSize(600, 400);
		this.addMouseListener(new MouseDraw());
		this.addMouseMotionListener(new MouseClick());
	}

	class MouseDraw extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse clicked");
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

	class MouseClick extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}