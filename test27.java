public class test27 {
	public static void main(String[] args) {
		TestClass cls = new TestClass();
		cls.superMethod1();
		cls.superMethod2();
		cls.method1();
		cls.method2();
	}
}

interface InterfaceSuperClass1 {
	int i = 10;

	void superMethod1();
}

interface InterfaceSuperClass2 {
	int k = 20;

	void method2();
}

class TestClass implements InterfaceSuperClass1, InterfaceSuperClass2 {
	public void superMethod1() {
		System.out.println("Message superMethod1 : " + i);
	}

	public void superMethod2() {
		System.out.println("Message superMethod2 : " + k);
	}

	public void method1() {
		System.out.println("Message method1");
	}

	public void method2() {
		System.out.println("Message method2");
	}
}