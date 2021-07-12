import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number:");
		Scanner reader=new Scanner(System.in);
		num=reader.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given number is even.");
		}
		else
		{
			System.out.println("Given number is odd.");
		}

	}

}
