import java.util.Scanner;
public class Nested_Switch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		Scanner reader=new Scanner(System.in);
		int choice =reader.nextInt();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("python");
			break;
		case 2:
			System.out.println("Enter your inner choice");
			int choice1 =reader.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("J2EE");
				break;
			case 2:
				System.out.println("advance java");
		}
		}

	}

}
