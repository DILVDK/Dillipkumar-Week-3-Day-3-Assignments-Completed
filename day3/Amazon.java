package week3.day3;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		Amazon payments = new Amazon();
				payments.cardPayments();
				payments.cashOnDelivery();
				payments.internetBanking();
				payments.upiPayments();
				payments.recordPaymentDetails();
	}

}
