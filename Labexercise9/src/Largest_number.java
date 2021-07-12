import java.util.Scanner;
public class Largest_number 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Largest number:");
		int a,b,c;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=reader.nextInt();
		System.out.println("Enter b value:");
		b=reader.nextInt();
		System.out.println("Enter c value:");
		c=reader.nextInt();
		
		if (a>b&&a>c)
			System.out.println("Largest number is "+a);
		else if(b>c)
			System.out.println("Largest number is "+b);
		else
			System.out.println("Largest number is "+c);
		
		
		

	}

}
