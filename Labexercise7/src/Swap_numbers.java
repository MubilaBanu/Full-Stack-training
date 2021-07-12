import java.util.Scanner;
public class Swap_numbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float a,b;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a Value:");
		a=reader.nextFloat();
		System.out.println("Enter b Value:");
		b=reader.nextFloat();
		System.out.println("***Before Swap***");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		float temp;
		temp=a;
		a=b;
		b=temp;
				
		System.out.println("***After Swap***");
		System.out.println("a is "+a);
		System.out.println("b is "+b);

	}

}
