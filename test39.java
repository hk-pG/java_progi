import java.awt.*;
import java.awt.event.*;

class test39 extends Frame implements ActionListener, ItemListener {
	public static void main(String[] args) {
		new test39();
	}

	test39() {
		setTitle("MenuTest");
		setSize(200, 120);
		setLayout(new FlowLayout());

		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);

		Menu menuFile = new Menu("File");
		menuFile.addActionListener(this);
		menuBar.add(menuFile);

		MenuItem menuOpen = new MenuItem("Open...", new MenuShortcut('O'));
		menuFile.add(menuOpen);
		menuFile.addSeparator();

		MenuItem menuExit = new MenuItem("Exit");
		menuFile.add(menuExit);

		Menu menuView = new Menu("View");
		menuView.addActionListener(this);
		menuBar.add(menuView);

		CheckboxMenuItem menuStatusBar = new CheckboxMenuItem("Status Bar");
		menuStatusBar.addItemListener(this);
		menuView.add(menuStatusBar);

		Menu menuSize = new Menu("Size");
		menuSize.addActionListener(this);
		menuView.add(menuSize);

		MenuItem menuSizeLarge = new MenuItem("Large");
		menuSize.add(menuSizeLarge);

		MenuItem menuSizeSmall = new MenuItem("Small");
		menuSize.add(menuSizeSmall);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

	public void itemStateChanged(ItemEvent e) {
		CheckboxMenuItem menu = (CheckboxMenuItem) e.getSource();
		if (menu.getState()) {
			System.out.println(menu.getLabel() + " SELECTED");
		} else {
			System.out.println(menu.getLabel() + " DESELECTED");
		}
	}
}