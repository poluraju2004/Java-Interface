package Interfaces;

public class MainPayment {

	public static void main(String[] args) {
		Payment p = new PaypalPayment();
		p.pay();
		
		Payment c = new CreditCardPayment();
		c.pay();

	}

}
