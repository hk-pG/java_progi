/**
 * test18
 */
public class test18 {

	private String exMsg = "test18";

	public static void main(String[] args) {
		test18 ei = new test18();
		ei.exeClass();
	}

	private class InInner {
		private String inMsg = "InInnerクラスのメンバ変数";

		void inMethod() {
			System.out.println(exMsg);
			System.out.println(inMsg);
		}
	}

	void exeClass() {
		InInner ii = new InInner();
		ii.inMethod();
	}
}