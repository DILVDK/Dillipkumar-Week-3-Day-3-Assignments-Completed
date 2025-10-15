package week3.day3;

public abstract class CanaraBank implements Payments{
	
	@Override
	public void cashOnDelivery() {
		System.out.println("Maximum Limit of CashOnDelivery is Rs.10000/- ");
	}


	@Override
	public void upiPayments() {
		System.out.println("Maximum Limit of UPI Payment is Rs.20000/- ");
		
	}


	@Override
	public void cardPayments() {
		System.out.println("Maximum Limit of Card Payment is Rs.30000/- ");
		
	}


	@Override
	public void internetBanking() {
		System.out.println("Maximum Limit of Internet Banking is Rs.40000/- ");
		
	}
	

	public static void recordPaymentDetails() {
		
		System.out.println("Payment Details are Updated Successfully");
		// TODO Auto-generated method stu

	}

}
