
public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment ref;
		ref = new Upi();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println("=================================");
		
		ref= new Card();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println("=================================");
		
		ref = new Wallet();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();

	}


}
