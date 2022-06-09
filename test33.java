import java.awt.*;

public class test33 extends Frame {
	public static void main(String[] args) {
		new test33();
	}

	test33() {
		super("CheckboxTest");
		setSize(200, 100);
		setLayout(new FlowLayout());
		Checkbox c1 = new Checkbox("OK?");
		add(c1);
		setVisible(true);
	}
}