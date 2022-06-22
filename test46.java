import java.awt.*;
import java.awt.event.*;

public class test46 extends Frame implements KeyListener {
	test46() {
		super("keyListenerTest");
		TextField tf1 = new TextField();
		tf1.addKeyListener(this);
		add(tf1);
		setSize(200, 100);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Type: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Press" + KeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Release" + KeyEvent.getKeyText(e.getKeyCode()));
	}

	public static void main(String[] args) {
		new test46();
	}
}