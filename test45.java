import java.awt.*;
import java.awt.event.*;

public class test45 extends Frame implements MouseMotionListener {
	public static void main(String[] args) {
		new test45();
	}

	test45() {
		super("MouseMotionListener");
		addMouseMotionListener(this);
		setSize(200, 100);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("D: " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("M: " + e.getX() + ", " + e.getY());
	}

}