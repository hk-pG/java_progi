import java.awt.*;

public class test29_2 extends Frame {
	public static void main(String[] args) {
		new test29_2();
	}

	test29_2() {
		super("ButtonTest");
		setSize(200, 100);
		setLayout(new GridLayout(2, 3));
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		Button b4 = new Button("B4");
		Button b5 = new Button("B5");
		Button b6 = new Button("B6");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setVisible(true);
	}
}