import java.awt.*;

public class test29_3 extends Frame {
	GridBagLayout gb1 = new GridBagLayout();

	public static void main(String[] args) {
		new test29_3();
	}

	void addButton(Button b, int x, int y, int w, int h) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gb1.setConstraints(b, gbc);
		add(b);
	}

	test29_3() {
		super("ButtonTest");
		setSize(200, 100);
		setLayout(gb1);
		Button b1 = new Button("B1");
		Button b2 = new Button("B2");
		Button b3 = new Button("B3");
		Button b4 = new Button("B4");
		addButton(b1, 0, 0, 1, 3);
		addButton(b2, 1, 0, 1, 1);
		addButton(b3, 1, 1, 1, 1);
		addButton(b4, 1, 2, 1, 1);
		setVisible(true);
	}
}