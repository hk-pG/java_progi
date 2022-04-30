/**
 * test16
 */
class test16 {
	// String toroku = "String";
	// int toroku = "int";

	void toroku(String name, String country) {
		System.out.println("名前は" + name);
		System.out.println("国は" + country);
	}

	void toroku(String name) {
		System.out.println("名前は" + name);
		System.out.println("国は日本");
	}

	public static void main(String[] args) {
		test16 object = new test16();
		object.toroku("Java 太郎");
	}
}