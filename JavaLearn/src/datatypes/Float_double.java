package datatypes;

public class Float_double {

	public static void main(String[] args)
	
	
	
	{
		
		
		//java by default takes double datatype for decimal values
		//float marks=  25.85;//throwing error due to java by default datatypes as double but we declared it as "float"
		
		
		float marks=  (float) 25.85;
		
		float marks1=25.855f;
		
		 System.out.println("my marks is "+marks);
		 
		 System.out.println("my marks1 is "+marks1);
		 
		 double total=78.89;
		 System.out.println("my total is "+total);
		 
		 
		 //downcasting=converting higher datatype to lower datatype
		 //in this case double downcasted to int type
		 
		 
		 int newmarks=(int) 89.56;
		 System.out.println("my total is "+newmarks);
		
	}

}
