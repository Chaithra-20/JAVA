
public class CasioCalci {
	public void acceptCalci(Calculator ref)
	{
		ref.add();
		ref.subtraction();
		ref.multi();
		int res=ref.div();
		System.out.println(res);
	}

}
