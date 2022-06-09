import java.awt.*;

public class test34 extends Frame {
	public static void main(String[] args) {
		new test34();
	}

	test34() {
		super("ChoiceTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		Choice c1 = new Choice();
		c1.add("ChoiceA");
		c1.add("ChoiceB");
		c1.add("ChoiceC");
		add(c1);
		setVisible(true);
	}
}
