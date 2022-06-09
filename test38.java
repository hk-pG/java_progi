import java.awt.*;

class MyCanvas extends Canvas {
	public void paint(Graphics g) {
		g.drawLine(10, 10, 120, 40);
	}
}

class test38 extends Frame {
	public static void main(String[] args) {
		new test38();
	}

	test38() {
		super("CanvasTest");
		setSize(200, 100);
		setLayout(new BorderLayout());
		MyCanvas mc1 = new MyCanvas();
		add(mc1, BorderLayout.CENTER);
		setVisible(true);
	}
}