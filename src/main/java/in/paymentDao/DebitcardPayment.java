package in.paymentDao;

public class DebitcardPayment implements Ipayments

{
	
	
	public DebitcardPayment()
	{
		System.out.println("debitcard constructor called ::");
	}
	
	
	@Override
	public boolean paybill(double total) 
	{
		System.out.println("debit card payment processing .....");
		
		return true;
	}

}
