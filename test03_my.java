public class test03_my {
	public static void main(String[] args) {
		String moji = "Hello World!!";
		// ^^^^^^^^^^^^^^^^^^^^^^^^^^^
		/*
		 * Stringは、文字列を表すクラスで、mojiはオブジェクトなのに、
		 * なんで文字列を直接代入できる?
		 */
		System.out.println(moji);
		System.out.println("文字数:" + moji.length());

		int len = "Hello World!!".length();
		/*
		 * ""で囲まれた部分がJavaではStringオブジェクトそのものとして
		 * 扱われるので、同じ型のオブジェクトであるmojiに"Hello World!!"が代入できる。
		 * また、"Hello World!!"は文字列オブジェクトであるため、
		 * "Hello World!!".length()で文字列の長さを取得できる。
		 */
		System.out.println("len: " + len);
	}
}