import java.util.Scanner;
public class Area_of_Circle 
{
	public static void main(System arg[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		double radius=reader.nextDouble();
		
		double area=Math.PI*radius*radius;
		System.out.println("Area is:"+area);
		
		double circumference=2*Math.PI*radius;
		System.out.println("Circumference is:"+circumference);
	}
}
