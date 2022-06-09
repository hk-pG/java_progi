import java.awt.*;

class test31 extends Frame {
	public static void main(String[] args) {
		new test31();
	}

	test31() {
		super("LabelTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		Label l1 = new Label("HelloWorld!!");
		add(l1);
		setVisible(true);
	}
}