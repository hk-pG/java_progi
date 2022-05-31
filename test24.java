import java.io.*;

class test24 {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader(args[0]);

			int c;
			String moji = new String();

			while ((c = in.read()) != -1) {
				moji += (char) c;
			}

			System.out.println(moji);
			in.close();
		} catch (FileNotFoundException ie) {
			System.out.println("ファイルがありません : " + ie);
		} catch (Exception e) {
			System.out.println("ファイル指定がありません : " + e);
		}
	}
}