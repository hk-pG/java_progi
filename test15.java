class Person {
	String myName;
	int myAge;

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

	public Person(String name, int age) {
		myName = name;
		myAge = age;
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