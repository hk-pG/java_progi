import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2 extends JFrame implements MouseListener {
	Point start;
	Point end;
	boolean isDraw = false;
	int w = 300;
	int h = 200;

	public static void main(String[] args) {
		new Main2();
	}

	Main2() {
		setSize(w, h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintFreeLine(g);
	}

	void paintFreeLine(Graphics g) {
		if (isDraw) {
			g.drawLine(start.x, start.y, end.x, end.y);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		isDraw = false;
		start = new Point(w / 2, h / 2);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isDraw = true;
		end = new Point(e.getX(), e.getY());
		super.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}