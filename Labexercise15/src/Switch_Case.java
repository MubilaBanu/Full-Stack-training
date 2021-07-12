import java.util.Scanner;

public class Switch_Case 
{
	public static void main(String arg[])
	{
		System.out.println("Enter your choice:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Case 1 will be executed.");
			break;
		case 2:
			System.out.println("Case 2 will be executed.");
			break;
		case 3:
			System.out.println("Case 3 will be executed.");
			break;
		case 4:
			System.out.println("Case 4 will be executed.");
			break;
		}
		
	}
}
