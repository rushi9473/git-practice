package in.testClasses;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.paymentService.ServicePayment;
import in.paymentDao.DebitcardPayment;


public class Test 

{

    int r;
   

	public static void main(String[] args)
	
	
	
   {
		
		System.out.println("before the oject creation....");
		
		
    	ApplicationContext ctxt= new ClassPathXmlApplicationContext("Springbeans.xml");
	
    ServicePayment	ob1= ctxt.getBean(ServicePayment.class);
    DebitcardPayment ob2=ctxt.getBean(DebitcardPayment.class);
    
    
   System.out.println( ob1.getClass().getName());;
   System.out.println( ob2.getClass().getName());;
    
    ob1.totalBill(1234.56);
     
}
}