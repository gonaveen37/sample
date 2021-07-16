package Arraydemo;

public class Arraylearn {

	public static void main(String[] args) {

		// created an array of 5 students id
		int student_id[] = new int[5];

		student_id[0] = 7;
		student_id[1] = 8;
		student_id[2] = 9;
		student_id[3] = 10;
		student_id[4] = 12;

		int arraysize = student_id.length;
		System.out.println("array length is " + arraysize);

		for (int i = 0; i < arraysize; i++) {

			System.out.println("total no of students with id " + student_id[i]);

		}

	}

}
