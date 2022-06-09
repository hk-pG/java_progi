import java.awt.*;

public class test29_4 extends Frame {
	public static void main(String[] args) {
		new test29_4();
	}

	test29_4() {
		super("ButtonTest");
		setSize(200, 100);
		setLayout(new BorderLayout());
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		Button b4 = new Button("B4");
		Button b5 = new Button("B5");
		add("North", b1);
		add("East", b2);
		add("South", b3);
		add("West", b4);
		add("Center", b5);
		setVisible(true);
	}
}