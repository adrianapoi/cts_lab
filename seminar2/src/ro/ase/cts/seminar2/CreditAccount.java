package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Transfererable;
import ro.ase.cts.seminar2.interfaces.Withdarawable;

public class CreditAccount extends BankAccount implements Depositable, Withdarawable{

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}	
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundExdeption {
		if(amount>0) {
			this.balance -= amount;
		}
	}

}