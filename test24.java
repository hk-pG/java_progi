import java.io.*;

class test24 {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			FileReader in = new FileReader(file);

			// FileReader in = new FileReader(args[0]);
			int c;
			String moji = new String();

			while ((c = in.read()) != -1) {
				moji += (char) c;
			}

			System.out.println(moji);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}