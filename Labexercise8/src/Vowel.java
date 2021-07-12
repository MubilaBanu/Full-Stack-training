import java.util.Scanner;
public class Vowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter alphabet Letter:");
		char alphabet;
		Scanner reader=new Scanner(System.in);
		alphabet=reader.next().charAt(0);
		
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
			System.out.println(alphabet + " is a vowel");
		else
			System.out.println(alphabet + " is not a vowel");
		

	}

}
