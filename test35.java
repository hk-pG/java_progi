import java.awt.*;

class test35 extends Frame {
	public static void main(String[] args) {
		new test35();
	}

	test35() {
		super("TextAreaTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		TextArea b1 = new TextArea("HelloWorld!!", 3, 20);
		add(b1);
		setVisible(true);
	}
}