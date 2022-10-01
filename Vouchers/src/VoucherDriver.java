

import java.util.ArrayList;
import java.util.Scanner;

public class VoucherDriver
{
	public static int Number=2000;
	public static void main(String[] args)
	{
		ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
		System.out.println("XYZ COMPANY Voucher Manager");
 
		int options=options();
		
		while(options != 0)
		{
			if(options == 1)
			{
			addVoucher(vouchers);
				}
			else if(options == 2)
			{
				displayVouchers(vouchers);
			}
			else if(options == 3)
			{
				issueCheck(vouchers);
			}
	
			System.out.println();
			options = options();
			}
		}


		public static int options()
		{
			Scanner scanner = new Scanner(System.in);			
			System.out.println("\nActivities available:\r\n" + "1. create voucher\r\n" + "2. print voucher register\r\n" + "3. issue checks");
			
			System.out.print("Enter number of choice (or zero to quit): ");
			int opt = scanner.nextInt();			
			while (opt<0 || opt>3)
			{
				System.out.println("\nInvalid choice. Try again.");
				System.out.println("\nActivities available:\r\n" + "1. create voucher\r\n" + "2. print voucher register\r\n" + "3. issue checks");
				System.out.print("Enter number of choice (or zero to quit): ");
				opt=scanner.nextInt();
			}			
			return opt;
		}
		

		public static void addVoucher(ArrayList<Voucher> vouchers)
		{		
			Scanner scanner = new Scanner(System.in);			
			System.out.print("\nEnter purchase date (dd/mm/yyyy): ");
			String date = scanner.nextLine();
			System.out.print("Enter amount: $");
			double amt = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter name of account to debit: ");
			String name = scanner.nextLine();
			System.out.print("Enter name of vendor: ");
			String vName = scanner.nextLine();			
			vouchers.add(new Voucher(name,vName,date,amt));
		}


		public static void displayVouchers(ArrayList<Voucher> vouchers)
		{
			System.out.println("\nVoucher Register:");
			for(int i = 0;i<vouchers.size();i++)
			{
				System.out.println(vouchers.get(i));
			}
		}
		
		public static void issueCheck(ArrayList<Voucher> vouchers)
		{		
			Scanner scanner = new Scanner(System.in);
			while (true)
			{
				boolean check = false;		
				System.out.print("\nEnter voucher number to pay: ");
				int num = scanner.nextInt();		
				for(int i = 0;i<vouchers.size();i++)
				{
				if(num == vouchers.get(i).getvoucherNumber())
					{
						check = true;		
						if(vouchers.get(i).getVendorName().compareToIgnoreCase("") == 0)
						{
							System.out.println("Voucher needs a vendor.");
							break;
						}		
						if(vouchers.get(i).getAmount() <= 0.0)
						{
							System.out.println("Voucher amount must be positive.");
							break;
						}
						 
						Number++;
						vouchers.get(i).setcheckNumber(Number);
						scanner.nextLine();
						System.out.print("Enter payment date (dd/mm/yyyy): ");
						String date = scanner.nextLine();
						vouchers.get(i).setPaymentDate(date);
						return;
					}
				}
			 
			if (!check)
				{
					System.out.println("No vouchers have that number.");
				}
			}
	}
}
