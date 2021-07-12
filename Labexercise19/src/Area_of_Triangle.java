import java.util.Scanner;
public class Area_of_Triangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the value of breadth:");
		double breadth=reader.nextDouble();
		System.out.println("Enter the value of height:");
		double height=reader.nextDouble();
		double area=0.5*breadth*height;
		System.out.println("Area is:"+area);

	}

}
