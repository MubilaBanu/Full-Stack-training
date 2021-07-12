import java.util.Scanner;
public class User_ArrayInput 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter 10 values:");
		int[] array=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=reader.nextInt();
		}
		int sum=0;
		for(int num:array)
		{
			sum=sum+num;
			
		}
		System.out.println("Sum of array is "+sum);
	}

}
