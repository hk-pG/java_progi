import java.awt.*;
import java.awt.event.*;

/**
 * test49
 */
public class test49 extends Frame {
	public static void main(String[] args) {
		new test49();
	}

	test49() {
		super("Window");
		this.addWindowListener(new MyWindowListener());
		setSize(200, 100);
		setVisible(true);
	}

	class MyWindowListener extends WindowAdapter {
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
		}
	}
}