package com.kodnest.multiThreading.Runnable;

public class Treatment implements Runnable{
	
	Hospital h;
	public Treatment(Hospital h)
	{
		this.h=h;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Treatment started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment inProgress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
