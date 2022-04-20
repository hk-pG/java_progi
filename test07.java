class test07 {
	public static void main(String[] args) {
		int a = 5, b = 3;
		String s, moji = "abc";
		s = moji + "def";
		System.out.println(s);
		s = a + moji;
		System.out.println(s);

		s = a + b + moji;

		// s = a + "" + b + moji;

		System.out.println(s);
	}
}