package com.kodnest.multiThreading.Doeman;

public class DeomanDemo {

	public static void main(String[] args) {
		//Instantiating thread objects
		TypingCode typingCode = new TypingCode();
		SavingCode savingCode = new SavingCode();
		ComplilingCode complilingCode = new ComplilingCode();
		
		//Set thread as Daemon Thread
		savingCode.setDaemon(true);
		complilingCode.setDaemon(true);
		
		//Start all Thread
		typingCode.start();
		savingCode.start();
		complilingCode.start();
	}

}
