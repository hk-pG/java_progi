
// applet を使うため
import java.applet.*;
// AWT を使うため，
import java.awt.*;
// イベント駆動関係のクラスを用いるため
import java.awt.event.*;
// Vector クラスを用いるため
import java.util.*;

// 線分のクラスを定義する．
class Line {
	// 始点，終点の X 座標，Y 座標を int で保持する．
	public int start_x, start_y, end_x, end_y;

	// Line のコンストラクタ
	public Line(int x1, int x2, int x3, int x4) {
		start_x = x1;
		start_y = x2;
		end_x = x3;
		end_y = x4;
	}
}

// 外側の Frame に直接 paint するのではなく, お絵書き領域を作る．
class MyCanvas extends Canvas implements KeyListener, MouseListener, MouseMotionListener {
	// Line の配列を保持する Vector クラスの変数 lineArray の宣言
	Vector<Line> lineArray;
	// マウスをドラッグ中かどうかを示す boolean 型(真偽値)の変数 dragging の宣言
	boolean dragging;
	// 表示する色を保持する変数
	Color lineColor;

	// コンストラクタの宣言
	public MyCanvas() {
		super();
		lineArray = new Vector<Line>();
		// ドラッグ中ではない
		dragging = false;
		// 線の色は黒に
		lineColor = Color.black;
		// GUI 部品と，Event Listener を関連づける
		setSize(600, 400);
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	Image offScreenImage;
	Graphics offScreenGraphics;

	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage = createImage(600, 400); // オフスクリーンイメージを 600x400 のサイズで作成
			offScreenGraphics = offScreenImage.getGraphics(); // オフスクリーンイメージに描画するためのGraphics オブジェクト
		}
		this.paint(offScreenGraphics); // 次の画面のイメージを作る．
		g.drawImage(offScreenImage, 0, 0, this); // イメージを本物のスクリーンに書き込む
	}

	// offScreenImage の書き直しをする際に呼ばれる
	public void paint(Graphics g) {
		int i;
		// 白で(0,0)-(600,400)を塗り潰す
		g.setColor(Color.white);
		g.fillRect(0, 0, 600, 400);
		// 色を設定
		g.setColor(lineColor);
		int size = lineArray.size();
		if (dragging)
			size--;
		for (i = 0; i < size; i++) {
			Line l = (Line) lineArray.elementAt(i);
			g.drawLine(l.start_x, l.start_y, l.end_x, l.end_y);
		}
		// マウスをドラッグ中の時は
		if (dragging) {
			// 赤い色で
			g.setColor(Color.red);
			// lines[lineCount] を描画する．
			Line l = (Line) lineArray.elementAt(i);
			g.drawLine(l.start_x, l.start_y, l.end_x, l.end_y);
		}
	}

	// KeyListener を実装するためのメソッド
	public void keyPressed(KeyEvent e) {
		// イベントからキーのコードを取り出す
		int key = e.getKeyChar();
		// デバッグ用の表示
		System.out.println("keyPressed(" + e + "," + key + ")");
		// 入力が 'q'の時は終了する
		if (key == 'q')
			System.exit(0);
	}

	// 要らないイベントに対応するメソッドも中身は空で書いておく必要がある．
	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	// MouseListener を実装するためのメソッド
	public void mousePressed(MouseEvent e) {
		// 押された時のマウスカーソルの位置を得る
		int mx = e.getX(), my = e.getY();
		// デバッグ用の表示
		System.out.println("mousePressed(" + e + "," + mx + "," + my + ")");
		// 配列 lines の lineCount 番目に線分を登録
		lineArray.addElement(new Line(mx, my, mx, my));
		// ドラッグ中であることを示す
		dragging = true;
		// 再表示をおこなう
		repaint();
	}

	// マウスのボタンが離された時のイベント
	public void mouseReleased(MouseEvent e) {
		// マウスカーソルの位置を得る
		int mx = e.getX(), my = e.getY();
		// デバッグ用の表示
		System.out.println("mouseUp(" + e + "," + mx + "," + my + ")");
		// 配列 lines の lineCount 番目の始点を変更
		Line l = (Line) lineArray.elementAt(lineArray.size() - 1);
		l.end_x = mx;
		l.end_y = my;
		dragging = false;
		// 再表示をおこなう
		repaint();
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	// MouseMotionListener を実装するためのメソッド
	public void mouseDragged(MouseEvent e) {
		// マウスカーソルの位置を得る
		int mx = e.getX(), my = e.getY();
		// デバッグ用の表示
		System.out.println("mouseDrag(" + e + "," + mx + "," + my + ")");
		// 配列 lines の lineCount 番目の始点を変更
		Line l = (Line) lineArray.elementAt(lineArray.size() - 1);
		l.end_x = mx;

		l.end_y = my;
		// 再表示をおこなう
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}

	// Delete ボタンが押された時の処理
	public void deleteLine() {
		int size;
		if ((size = lineArray.size()) > 0) {
			lineArray.removeElementAt(size - 1);
			repaint();
		}
	}

	// Clear ボタンが押された時の処理
	public void clearLine() {
		lineArray.removeAllElements();
		repaint();
	}
}

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
		// キー入力が button に横取りされないようにするため
		deleteButton.addKeyListener(myCanvas);
		clearButton.addKeyListener(myCanvas);
		// 部品をおさめるのに適当と思われるサイズにする．
		setSize(getPreferredSize());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		Object source = e.getSource();
		// Delete ボタンが押された時
		if (source.equals(deleteButton)) {
			myCanvas.deleteLine();
		}
		// Clear ボタンが押された時
		else if (source.equals(clearButton)) {
			myCanvas.clearLine();
		}
		// [Edit]メニューのどれかが選択された時
		else if (source.equals(editMenu)) {

			String command = e.getActionCommand();
			// Delete メニューが選択された時
			if (command.equals("Delete")) {
				myCanvas.deleteLine();
			}
			// Clear メニューが選択された時
			else if (command.equals("Clear")) {
				myCanvas.clearLine();
			}
		}
		// [File]メニューのどれかが選択された時
		else if (source.equals(fileMenu)) {
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
