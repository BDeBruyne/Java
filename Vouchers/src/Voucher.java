

public class Voucher 
	{ 
	private static int count=1000;
	private String accountName,purchaseDate,paymentDate,vendorName;
	private double amount;
	private int nextVoucherNumber;
	private int nextCheckNumber;
	 
	public Voucher() 
	{
		count++;
		accountName="";
		purchaseDate="";
		vendorName="";
		amount=0;
		nextVoucherNumber=count;
		nextCheckNumber=0;
		paymentDate=null;
	}
	 
	public Voucher(String name,String vName,String date,double amt) 
	{
		count++;
		accountName=name;
		purchaseDate=date;
		vendorName=vName;
		amount=amt;
		nextVoucherNumber=count;
		nextCheckNumber=0;
		paymentDate=null;
	}
	 
	public String getaccountName() 
	{
		return accountName;
	}
	public String getpurchaseDate() 
	{
		return purchaseDate;
	}
	public String getPaymentDate() 
	{
		return paymentDate;
	}
	public String getVendorName() 
	{
		return vendorName;
	}
	public double getAmount()
	{
		return amount;
	}
	public int getvoucherNumber()
	{
		return nextVoucherNumber;
	}
	public int getCheckNum()
	{
		return nextCheckNumber;
	}
	
	 
	public void setPaymentDate(String paymentDate) 
	{
		this.paymentDate = paymentDate;
	}
	public void setcheckNumber(int nextCheckNumber) 
	{
		this.nextCheckNumber = nextCheckNumber;
	}
	
	
	@Override
	public String toString()
	{
	return "voucher #"+nextVoucherNumber+" date: "+purchaseDate+" amount: $"+String.format("%.2f",amount)+"\naccount: "+accountName+" vendor: "+
	vendorName+"\ncheck #"+nextCheckNumber+" date: "+paymentDate;
	}
}