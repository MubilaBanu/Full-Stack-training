import java.util.Scanner;
public class Area_of_Square 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the value of side:");
		double side=reader.nextDouble();
		
		double area=side*side;
		System.out.println("Area is:"+area);

	}

}
