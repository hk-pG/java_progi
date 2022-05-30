import myPackage.Person;

class Member extends Person {
	int myNumber;

	Member() {
		super("tanaka");
		super.SetAge(26);
	}

	public void SetNumber(int number) {
		myNumber = number;
		PrintSet();
	}

	public int GetNumber() {
		return myNumber;
	}

	public void PrintSet() {
		System.out.println("Set Member Value!!");
	}
}

class test22 {
	public static void main(String[] args) {
		Member tanaka = new Member();
		tanaka.SetNumber(12);

		System.out.println(tanaka.GetName());
		System.out.println(tanaka.GetAge());
		System.out.println(tanaka.GetNumber());
	}
}