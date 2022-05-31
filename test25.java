import java.util.Scanner;

public class test25 {
	public static void main(String[] args) {

		String line = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("文字列を入力して下さい(終了する際はctrl+d) : ");
		while (sc.hasNext()) {
			line = sc.nextLine();
			System.out.println(line);
			System.out.print("文字列を入力して下さい(終了する際はctrl+d) : ");
		}

		sc.close();
	}
}