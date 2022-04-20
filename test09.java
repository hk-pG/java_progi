public class test09 {
	public static void main(String[] args) {
		String s1 = new String("abcde");
		// String s2 = "abcdo";
		String s2 = "abcde";
		System.out.print(s1 + "=" + s2 + ":");

		if (s1.equals(s2)) {
			System.out.println("Match!");
		} else {
			System.out.println("No Match!");
		}
	}
}
