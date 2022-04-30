/**
 * test18
 */
public class test18 {

	private String exMsg = "test18";

	public static void main(String[] args) {
		test18 ei = new test18();
		ei.exeClass();
	}

	void exeClass() {
		InInner ii = new InInner();
		ii.inMethod();
		// ii.obj.exeClass();
	}

	public class InInner {
		private String inMsg = "InInnerクラスのメンバ変数";
		// public test18 obj = new test18();

		void inMethod() {
			System.out.println(exMsg);
			System.out.println(inMsg);
		}

		// void callBackOuter() {
		// obj.exeClass();
		// }
	}
}