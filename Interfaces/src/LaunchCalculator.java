
public class LaunchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CasioCalci casioCalci = new CasioCalci();
		casioCalci.acceptCalci(new MyCalculator());
		casioCalci.acceptCalci(new MyCalculator1());

	}

}
