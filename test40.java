import java.awt.*;
import java.awt.event.*;

/**
 * test40
 */
public class test40 extends Frame {

	public static void main(String[] args) {
		new test40();
	}

	test40() {
		setTitle("DialogTest");
		setSize(200, 120);
		MyDialog dlg = new MyDialog(this);
		// dlg.setSize(200, 120);
		setVisible(true);
	}
}

class MyDialog extends Dialog implements ActionListener {
	MyDialog(Frame owner) {
		super(owner);
		setLayout(new FlowLayout());
		Button b1 = new Button("OK");
		b1.addActionListener(this);
		add(b1);
		setTitle("MyDialog");
		setSize(80, 80);
	}

	public void actionPerformed(ActionEvent e) {
		// hide();
		setVisible(false);
	}
}