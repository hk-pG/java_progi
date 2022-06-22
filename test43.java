import java.awt.*;
import java.awt.event.*;

/**
 * test43
 */
public class test43 extends Frame implements WindowListener {
	public static void main(String[] args) {
		new test43();
	}

	test43() {
		super("WindowListenerTest");
		this.addWindowListener(this);
		setSize(200, 100);
		setVisible(true);
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconIfied");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}