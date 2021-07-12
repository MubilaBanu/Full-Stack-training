import java.util.Scanner;
public class Print_an_Integer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create reader instance for getting a number from keyboard
		//create header file for using scanner
		System.out.println("Enter Number:");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt();
		System.out.println("The given nuber is..."+a);
		
	}

}
