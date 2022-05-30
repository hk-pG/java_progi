public class AccessTest4 extends AccessTest1 {
	public static void main(String[] args) {
		// AccessTest4 test4 = new AccessTest4();
		// AccessTest5 test5 = new AccessTest5();
		// System.out.println(test4);
		// System.out.println(test5);
		System.out.println("COMPLETE");
	}

	AccessTest4() {
		this.publicValue = 1;
		this.protectedValue = 2;
		this.normalValue = 3;
		System.out.println(this.publicValue);
		System.out.println(this.protectedValue);
		System.out.println(this.normalValue);
		// this.privateValue = 4;
	}
}

class AccessTest5 {
	AccessTest5() {
		AccessTest1 o = new AccessTest1();
		o.publicValue = 1;
		o.protectedValue = 2;
		o.normalValue = 3;
		System.out.println(o.publicValue);
		System.out.println(o.protectedValue);
		System.out.println(o.normalValue);
		// o.privateValue = 4;
	}
}