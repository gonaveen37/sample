package thiskeyworddemo;

public class Thiskeyword {

	public Thiskeyword() {

		this("naveen");

		System.out.println("hii welcome to java learning");

	}

	public Thiskeyword(String Name) {

		this(437);
		System.out.println("my name is " + Name);

	}

	public Thiskeyword(int roll) {
		this("telugu", 6);
		System.out.println("my rollnumber is " + roll);

	}

	public Thiskeyword(String medium, int subject) {

		System.out.println("iam from " + medium + " medium " + "havaing total subjects are " + subject);

	}

	public static void main(String[] args) {

		//Thiskeyword obj1 = new Thiskeyword();
		 //Thiskeyword obj2 = new Thiskeyword("naveen");
		 Thiskeyword obj3 = new Thiskeyword(437);

	}

}
