
public class PrintQuadrant {
	public void checkQuadrant(int x, int y)
	{
		if(x>0 && y>0)
		{
			System.out.println("QUADRANT A");
		}
		else if(x<0 && y>0)
		{
			System.out.println("QUADRANT B");
		}
		else if(x<0 && y<0)
		{
			System.out.println("QUADRANT C");
		}
		else
		{
			System.out.println("QUADRANT D");
		}
	}

}
