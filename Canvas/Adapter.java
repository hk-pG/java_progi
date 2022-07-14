import java.awt.*;
import java.awt.event.*;

/**
 * test49
 */
public class Adapter extends Frame {
	public static void main(String[] args) {
		new Adapter();
	}

	Adapter() {
		super("Window");
		this.addWindowListener(new MyWindowListener());
		this.addMouseMotionListener(
				new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						System.out.println("mouseDragged");
					}
				});

		setSize(200, 100);
		setVisible(true);
	}

	void sayHello() {
		System.out.println("Hello World!");
	}

	class MyWindowListener extends WindowAdapter {
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
		}

		void fnc() {
			sayHello();
		}
	}
}