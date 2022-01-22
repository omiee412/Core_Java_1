import java.util.Scanner;

class ScannerDemo2
{
	public static void main(String []args)
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter First Value");
		double a=sc1.nextDouble();
		System.out.println("Enter Second Value");
		double b=sc1.nextDouble();
		System.out.println("Enter Third Value");
		double c=sc1.nextDouble();

		double add=a+b+c;
		System.out.println("Addition is "+add);

		double multiply=a*b*c;
		System.out.println("Multiplication is "+multiply);


	}
}