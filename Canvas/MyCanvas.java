
// applet を使うため
// import java.applet.*;
// AWT を使うため，
import java.awt.*;
// イベント駆動関係のクラスを用いるため
import java.awt.event.*;
// Vector クラスを用いるため
import java.util.*;

// 外側の Frame に直接 paint するのではなく, お絵書き領域を作る．
class MyCanvas extends Canvas implements
		MouseListener, //
		MouseMotionListener //
{
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

	// MouseListener を実装するためのメソッド
	public void mousePressed(MouseEvent e) {
		// 押された時のマウスカーソルの位置を得る
		int mx = e.getX(), my = e.getY();
		mx = 600 / 2;
		my = 400 / 2;
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
		// Line l = (Line) lineArray.elementAt(lineArray.size() - 1);
		// l.end_x = mx;
		// l.end_y = my;
		// lineArrayを初期化
		lineArray.removeAllElements();
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