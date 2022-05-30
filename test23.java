class test23 {
	public static void main(String[] args) {
		String moji = new String("hamamatsu technical high school.");

		System.out.println(moji);
		System.out.println(moji.length());

		System.out.println("=== matches ===");
		if (moji.matches("(.*)hamamatsu(.*)")) {
			System.out.println(moji + " is contained in hamamatsu.");
		} else {
			System.out.println(moji + " is not contained in hamamatsu.");
		}

		System.out.println("=== replace ===");
		moji = moji.replace('a', 'A');
		System.out.println(moji);

		System.out.println("=== toUpperCase ===");
		moji = moji.toUpperCase();
		System.out.println(moji);

		String[] words = new String[100];

		words = moji.split(" ");

		System.out.println("=== Words contained in " + moji + " ===");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}