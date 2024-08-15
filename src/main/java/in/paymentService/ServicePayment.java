package in.paymentService;


import in.paymentDao.Ipayments;

public class ServicePayment

{
	
public 	Ipayments payment;

	public ServicePayment()
	{
		
		
		System.out.println("Payment constructor called ::");

	
	
	}
	
	public void setPayment(Ipayments payment)
	{
		System.out.println("setter method is getting called");
		this.payment=payment;
	}
	
	


public void totalBill(double total )

  { 
	
	boolean status =payment.paybill(total);
	
	if(status)
		System.out.println("paymnet is successsful....");
	else 
		System.out.println("payment is not done ...please try again ");
	
   }



}
