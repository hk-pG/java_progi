
// applet を使うため
// import java.applet.*;
// AWT を使うため，
import java.awt.*;
// イベント駆動関係のクラスを用いるため
import java.awt.event.*;
// Vector クラスを用いるため

class CanvasTest extends Frame implements ActionListener {
	MenuBar menuBar;
	Menu fileMenu, editMenu;
	MyCanvas myCanvas;
	Button deleteButton, clearButton;

	CanvasTest() {
		super("CanvasTest");
		// メニューバーを作成する
		menuBar = new MenuBar();
		// File というメニュー
		fileMenu = new Menu("File");
		fileMenu.add("Exit");
		// メニューが選択された時に, CanvasTest がイベントを受け取る
		fileMenu.addActionListener(this);
		// メニューバーに fileMenu を加える．
		menuBar.add(fileMenu);
		editMenu = new Menu("Edit");
		editMenu.add("Clear");
		editMenu.add("Delete");
		editMenu.addActionListener(this);
		menuBar.add(editMenu);
		// Frame にメニューバーを付け加える．
		setMenuBar(menuBar);
		// パネル(ボタンなどを配置するための入れ物)部分を作成する．
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout());
		panel.add(deleteButton = new Button("Delete"));
		deleteButton.addActionListener(this);
		panel.add(clearButton = new Button("Clear"));
		clearButton.addActionListener(this);
		// BorderLayout を用いる．
		setLayout(new BorderLayout());
		// 上部に Panel
		add(panel, "North");
		// 下部に MyCanvas を配置する．
		add(myCanvas = new MyCanvas(), "South");
		// 部品をおさめるのに適当と思われるサイズにする．
		setSize(getPreferredSize());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		Object source = e.getSource();
		// Delete ボタンが押された時
		// if (source.equals(deleteButton)) {
		// myCanvas.deleteLine();
		// }
		// // Clear ボタンが押された時
		// else if (source.equals(clearButton)) {
		// myCanvas.clearLine();
		// }
		// [Edit]メニューのどれかが選択された時
		// else if (source.equals(editMenu)) {

		// String command = e.getActionCommand();
		// // Delete メニューが選択された時
		// if (command.equals("Delete")) {
		// myCanvas.deleteLine();
		// }
		// // Clear メニューが選択された時
		// else if (command.equals("Clear")) {
		// myCanvas.clearLine();
		// }
		// }
		// [File]メニューのどれかが選択された時
		// else
		if (source.equals(fileMenu)) {
			String command = e.getActionCommand();
			// Exit メニューが選択された時
			if (command.equals("Exit")) {
				System.exit(0);
			}
		}
	}

	public static void main(String args[]) {
		// CanvasTest のインスタンスを作成 frame に代入
		CanvasTest frame = new CanvasTest();
	}
}