package in.paymentDao;

public class CreditcardPayment implements Ipayments
{
	public CreditcardPayment()
	{
		System.out.println("Creditcard constructor called ::");
	}
	@Override
	public boolean paybill(double total) 
	{
		System.out.println("credit card payment processing ......");
		return true;
	}

}
