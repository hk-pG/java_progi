import java.awt.*;
import java.awt.event.*;

public class test42 extends Frame {
	public static void main(String[] args) {
		new test42();
	}

	test42() {
		super("ActionListenerTest2");
		Button b1 = new Button("Button1");
		b1.addActionListener(new MyActionListener());
		add(b1);
		setSize(200, 100);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
