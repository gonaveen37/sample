package Constructor;

public class Constructordemo {

	public Constructordemo() {

		System.out.println("default constructor");

	}

	public Constructordemo(String place) {

		System.out.println("my navative is " + place);

	}

	public Constructordemo(int integer) {

		System.out.println("integer constructor");

	}

	public Constructordemo(String str, int integer) {

		System.out.println("string constructor integer constructor");

	}

	public static void main(String[] args) {

		Constructordemo obj1 = new Constructordemo();
		obj1.method();

	}

	public void method() {

		System.out.println("iam in method ");
	}

}
