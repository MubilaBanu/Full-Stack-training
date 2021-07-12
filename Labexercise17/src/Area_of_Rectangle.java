import java.util.Scanner;
public class Area_of_Rectangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the value of length:");
		double length=reader.nextDouble();
		System.out.println("Enter the value of width:");
		double width=reader.nextDouble();
		double area=length*width;
		System.out.println("Area is:"+area);
		

	}

}
