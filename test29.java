import java.awt.*;

public class test29 extends Frame {
	public static void main(String[] args) {
		new test29();
	}

	test29() {
		super("ButtonTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		Button b1 = new Button("OK");
		add(b1);
		setVisible(true);
	}
}