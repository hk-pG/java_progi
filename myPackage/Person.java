package myPackage;

public class Person {
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
		// void SetAge(int age) {
		if (age < 0) {
			System.out.println("エラー：年齢に負数'" + age + "'は登録できません");
			myAge = 0;
		} else {
			myAge = age;
		}
		// myAge = age;
		PrintSet();
	}

	public int GetAge() {
		return myAge;
	}

	public void PrintSet() {
		System.out.println("Set Value!!");
	}

	public Person() {
		SetAge(0);
		SetName("");
	}

	public Person(String name, int age) {
		SetAge(age);
		SetName(name);
	}

	public Person(int age) {
		SetAge(age);
	}

	public Person(String name) {
		SetName(name);
	}
}