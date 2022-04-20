public class test13 {
	public static void main(String[] args) {
		switch (args[0].charAt(0)) {
			case '日':
				System.out.println("市場へ出かけ、糸と麻を買ってきた");
				break;
			case '月':
				System.out.println("お風呂を炊いて");
				break;
			case '火':
				System.out.println("お風呂に入り");
				break;
			case '水':
				System.out.println("友達が来て");
				break;
			case '木':
				System.out.println("送っていった");
				break;
			case '金':
				System.out.println("糸巻きもせず");
				break;
			case '土':
				System.out.println("おしゃべりばかり");
				break;
			default:
				System.out.println("そんな曜日はありません！");
				break;
		}
		System.out.println("ともだちよ、これが私の一週間の仕事です。");
	}
}