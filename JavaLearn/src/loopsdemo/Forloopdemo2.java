package loopsdemo;

public class Forloopdemo2 
{

	public static void main(String[] args ) throws Exception
	{
	
	Forloopdemo2.pyramid();
	Forloopdemo2.invertedpyramid();
	}
	public static void pyramid() throws Exception
	
	{
		int rows=5;
		System.out.println("for loop started");
		
		for(int i=1;i<=rows;++i)
		{
		for(int j=1;j<=i;++j)
		{
		
		//System.out.print(i+" ");
		System.out.print(j+" ");
		}
		
		System.out.println(" ");
		
		}
		
		System.out.println("for loop ended");
		
	}


	public static void invertedpyramid() throws Exception
	
	{
		int rows=5;
		System.out.println("for loop started");
		
		for(int i=rows;i>=1;--i)
		{
		for(int j=1;j<=i;++j)
		{
		
		//System.out.print(i+" ");
		System.out.print(j+" ");
		}
		
		System.out.println(" ");
		
		}
		
		System.out.println("for loop ended");
		
	}
	

}