public class AccessTest4 extends AccessTest1 {
	public static void main(String[] args) {
	}

	AccessTest4() {
		this.publicValue = 1;
		this.protectedValue = 2;
		this.normalValue = 3;
		// this.privateValue = 4;
	}
}

class AccessTest5 {
	AccessTest5() {
		AccessTest1 o = new AccessTest1();
		o.publicValue = 1;
		o.protectedValue = 2;
		o.normalValue = 3;
		// o.privateValue = 4;
	}
}