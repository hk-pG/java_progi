import java.awt.*;

public class test29_1 extends Frame {
	public static void main(String[] args) {
		new test29_6();
	}

	test29_1() {
		super("ButtonTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
	}
}