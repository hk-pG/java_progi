public class test12 {
	public static void main(String[] args) {
		int[] a = { 31, 23, 32, 12, 44, 40 };
		int max = 0, i;
		for (i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]" + a[i]);
		}
		System.out.println("----------------");

		i = 1;
		do {
			if (a[max] < a[i]) {
				max = i;
			}
			i++;
		} while (i < a.length);

		System.out.println("Max=a[" + max + "]=" + a[max]);
	}
}