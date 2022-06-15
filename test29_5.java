import java.awt.*;

public class test29_5 extends Frame {
	public static void main(String[] args) {
		new test29_5();
	}

	test29_5() {
		super("ButtonTest");
		setSize(200, 100);
		CardLayout c1 = new CardLayout();
		setLayout(c1);
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		add("b1", b1);
		add("b2", b2);
		add("b3", b3);
		c1.show(this, "b2");
		setVisible(true);
	}
}