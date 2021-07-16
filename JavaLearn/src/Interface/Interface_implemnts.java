package Interface;

//Interfacedemo is base class
//Interface_implemnts is child class

public class Interface_implemnts implements Interfacedemo {

	public static void main(String[] args) {

		Interface_implemnts obj1 = new Interface_implemnts();
		obj1.add();
		obj1.sub();
		obj1.sine();
		obj1.cosine();

		Interfacedemo obj3 = new Interface_implemnts();

		obj3.add();
		obj3.sub();

		// obj3.sine();//base class can access only base methods and it cannot access
		// child class methods like sine(),cosine() methods
		// obj3.cosine();

		/*------------------------------------------------------------------------------------------------------ 
		 		// Interfacedemo obj2=new Interfacedemo();
				// you cannot create object of an Interface the reason is the methods are not
				// fully implemented in class means every method should have body but interface
				// def says only method declaration not method body
				
		-------------------------------------------------------------------------------------------------------------*/

		// Interface_implemnts obj2=new Interfacedemo();

		// You cannot create object of an interface beacause it is a abstract
		// method(only declaration no body)

	}

	public void sine() {

		System.out.println("iam in sine method");

	}

	public void cosine() {

		System.out.println("iam in cosine method");

	}

	public void add() {

		System.out.println("iam in add method");

	}

	public void sub() {

		System.out.println("iam in sub method");

	}

}
