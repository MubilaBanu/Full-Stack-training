import java.util.Scanner;
public class While_loop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num,sum=0;
		System.out.println("Enter n number within 10:");
		
		Scanner reader=new Scanner(System.in);
		num=reader.nextInt();
		
		while(num<=10)
		{
			sum+=num;
			
			num++;
			System.out.println("Sum of number is:"+sum);
		}

	}

}
