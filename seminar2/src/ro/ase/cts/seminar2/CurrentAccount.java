package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.NotificationService;

public class CurrentAccount extends BankAccount implements Depositable {

	public static double MAX_CREDIT=5000;
	public NotificationService notificationService;
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double balance, String iban,double maxCredit) {
		super(balance, iban);
		
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void withdraw(double amount) throws InsufficientFundExdeption {
		if(this.balance>=amount) {
		this.balance-= amount;	
		}
		else {
			throw new InsufficientFundExdeption("fonduri insuficiente");
		}
		if(this.notificationService != null) {
		this.notificationService.sendNotification("S-a extras suma: " + amount );
	}
	}

	public void trasfer(double amount, Depositable destination) throws IlegalTransferException, InsufficientFundExdeption {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IlegalTransferException("Conturile coincid!");
		}
		else
			this.withdraw(amount);
			((CurrentAccount) destination).deposit(amount);
	}

	public void deposit(double amount) {
		//this.setBalance(getBalance() + amount);
		this.balance+= amount;
	}

	
}
