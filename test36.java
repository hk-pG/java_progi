import java.awt.*;

class test36 extends Frame {
	public static void main(String[] args) {
		new test36();
	}

	test36() {
		super("ListTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		List list1 = new List();
		list1.add("ListA");
		list1.add("ListB");
		add(list1);
		setVisible(true);
	}
}
