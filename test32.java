import java.awt.*;

class test32 extends Frame {
	public static void main(String[] args) {
		new test32();
	}

	test32() {
		super("TestTextField");
		setSize(200, 100);
		setLayout(new FlowLayout());
		TextField t1 = new TextField("Hello World!!");
		add(t1);
		setVisible(true);
	}
}