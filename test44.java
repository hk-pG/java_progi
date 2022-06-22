import java.awt.*;
import java.awt.event.*;

/**
 * test44
 */
public class test44 extends Frame implements MouseListener {
	public static void main(String[] args) {
		new test44();
	}

	test44() {
		super("MouseListenerTest");
		this.addMouseListener(this);
		setSize(200, 100);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseClicked");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("MousePressed");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("MousePressed");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("MouseEntered");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("MouseExited");
	}
}