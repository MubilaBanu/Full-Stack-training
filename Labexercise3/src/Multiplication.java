import java.util.Scanner;
	//header file to get the data from the keyboard
public class Multiplication 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Multiplication of two numbers..");
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=reader.nextInt();
		System.out.println("Enter b value:");
		int b=reader.nextInt();
		int result=a*b;
		System.out.println("Result is..."+result);
		
		
	}

}
