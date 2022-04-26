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
}

public class test14 {
	public static void main(String[] args) {
		Person tanaka = new Person();
		tanaka.setName("Tanaka");
		tanaka.setAge(26);

		Person suzuki;
		suzuki.myName = "Suzuki";
		suzuki.myAge = 32;

		System.out.println(tanaka.GetName());
		System.out.println(tanaka.GetAge());
		System.out.println(suzuki.GetName());
		System.out.println(suzuki.GetAge());
	}
}