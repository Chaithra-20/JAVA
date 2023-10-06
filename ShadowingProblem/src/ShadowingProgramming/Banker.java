package ShadowingProgramming;

public class Banker {

	int cusId;
	String cusName;
	int cusSalary;
	String cusCity;
	long accNum;
	String bankName;
	String bankerName;
	String cusDob;
	String cusEmail;
	long cusPhone;
	
	public Banker(int cusId, String cusName, int cusSalary, String cusCity, long accNum, String bankName,
			String bankerName, String cusDob, String cusEmail, long cusPhone) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusSalary = cusSalary;
		this.cusCity = cusCity;
		this.accNum = accNum;
		this.bankName = bankName;
		this.bankerName = bankerName;
		this.cusDob = cusDob;
		this.cusEmail = cusEmail;
		this.cusPhone = cusPhone; 
		
	}
		void account()
		{
			System.out.println(cusName+" is having account in " +bankName+ " bank in "+cusCity);
		}
		
		void deposit()
		{
			System.out.println(cusName+" is deposited his salary of "+cusSalary+" rs amount into his "+accNum+ " account number");
		}
	}
	
	
	
	

