public class AccessTest1 {
	public int publicValue;
	protected int protectedValue;
	int normalValue;
	private int privateValue;

	public static void main(String[] args) {
	}

	public AccessTest1() {
		this.publicValue = 1;
		this.protectedValue = 2;
		this.normalValue = 3;
		this.privateValue = 4;
	}
}

class AccessTest2 extends AccessTest1 {
	AccessTest2() {
		this.publicValue = 1;
		this.protectedValue = 2;
		this.normalValue = 3;
		// this.protectedValue = 4;
	}
}

class AccessTest3 {
	AccessTest3() {
		AccessTest1 o = new AccessTest1();
		o.publicValue = 1;
		o.protectedValue = 2;
		o.normalValue = 3;
		// o.privateValue = 4;
	}
}