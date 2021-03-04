package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;

public class CurrentAccount extends BankAccount {

	public static double MAX_CREDIT=5000;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban,double maxCredit) {
		super(balance, iban);
		//this.maxCredit=maxCredit;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundExdeption {
		if(this.balance>=amount) {
		this.balance-= amount;	
		}
		else {
			throw new InsufficientFundExdeption("fonduri insuficiente");
		}
	}

	@Override
	public void trasfer(double amount, Account destination) throws IlegalTransferException, InsufficientFundExdeption {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IlegalTransferException("Conturile coincid!");
		}
		else
			this.withdraw(amount);
			destination.deposit(amount);
	}

	@Override
	public void deposit(double amount) {
		//this.setBalance(getBalance() + amount);
		this.balance+= amount;
	}

	
}
