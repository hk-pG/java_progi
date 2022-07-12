
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