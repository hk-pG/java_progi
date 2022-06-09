import java.awt.*;

class test37 extends Frame {
	public static void main(String[] args) {
		new test37();
	}

	test37() {
		super("ScrollbarTest");
		setSize(200, 100);
		setLayout(new BorderLayout());
		Scrollbar sb1 = new Scrollbar(Scrollbar.HORIZONTAL);
		add(sb1, BorderLayout.SOUTH);
		setVisible(true);
	}
}