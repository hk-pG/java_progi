import java.awt.*;
import java.awt.event.*;

public class test41 extends Frame implements ActionListener {
	public static void main(String[] args) {
		new test41();
	}

	test41() {
		super("ActionListenerTest");
		Button b1 = new Button("Button1");
		b1.addActionListener(this);
		add(b1);
		setSize(200, 100);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.exit(0);
	}
}