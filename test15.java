class Person {
	String myName;
	int myAge;

	// private Person(String name, int age) {
	Person(String name, int age) {
		myName = name;
		myAge = age;
	}

	public void SetName(String name) {
		myName = name;
		PrintSet();
	}

	public String GetName() {
		return myName;
	}

	public void SetAge(int age) {
		myAge = age;
		PrintSet();
	}

	public int GetAge() {
		return myAge;
	}

	public void PrintSet() {
		System.out.println("Set Value!!");
	}
}

/**
 * test15
 */
public class test15 {
	public static void main(String[] args) {
		Person tanaka = new Person("tanaka", 26);

		System.out.println(tanaka.GetName());
		System.out.println(tanaka.GetAge());
	}
}