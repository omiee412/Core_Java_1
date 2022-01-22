import java.util.Scanner;

class ScannerDemo4
{
	public static void main(String []args)
	{
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter Radius");
		int rad=sc1.nextInt();

		double op1= new ScannerDemo4().Area(rad);
		System.out.println("Radius of Circle is "+op1);

		double op2= new ScannerDemo4().Circumference(rad);
		System.out.println("Circumference of Circle is "+op2);

	}
	double Area(int radius)
	{
		double ar=3.14*radius*radius;
		return ar;
	}
	double Circumference (int radii)
	{
		double cr=2*3.14*radii;
		return cr;
	}
}