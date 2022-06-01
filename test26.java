abstract class Oya {
	private int price = 1980;

	int getPrice() {
		return price;
	}
}

class Ko1 extends Oya {
	int sales() {
		double d = getPrice() * 0.9;
		return (int) d;
	}
}

class Ko2 extends Oya {
	int sales() {
		double d = getPrice() * 0.8;
		return (int) d;
	}
}

class test26 {
	public static void main(String[] args) {
		Ko1 koObj1 = new Ko1();
		Oya oyaObj = koObj1;
		System.out.println("Price: " + oyaObj.getPrice());
		System.out.println("90%: " + koObj1.sales());
		Ko2 koObj2 = new Ko2();
		oyaObj = koObj2;
		System.out.println("80%: " + koObj2.sales());
	}
}