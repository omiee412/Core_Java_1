import java.util.Scanner;

class ScannerDemo3
{
	public static void main(String []args)
	{
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter Price");
		double lasun=sc1.nextDouble();
		System.out.println("Enter Quantity");
		int lavda=sc1.nextInt();
		
		double op=TotalBill(lavda,lasun);
		System.out.println("Total Bill is "+op);
		

	}
	static double TotalBill(int amba, double peru)
	{
		double bill=amba*peru;
		return bill;
	}
}