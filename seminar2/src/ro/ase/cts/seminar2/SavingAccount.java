package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transfererable;
import ro.ase.cts.seminar2.interfaces.Withdarawable;

public class SavingAccount extends BankAccount implements Profitable, Depositable, Withdarawable, Transfererable {

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) throws InsufficientFundExdeption {
		if(amount<=this.balance)
		this.balance-=amount;		
	}


	public void trasfer(double amount, Account destination) throws IlegalTransferException, InsufficientFundExdeption {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IlegalTransferException("Conturile coincid!");
		}
		else
			this.withdraw(amount);
			((SavingAccount) destination).deposit(amount);
		
	}

	public void deposit(double amount) {
		this.balance +=amount;		
	}

	@Override
	public void addInterest(double interest) {
		this.balance*=(1+interest/100);
		
	}

	@Override
	public void trasfer(double amount, Depositable destination)
			throws IlegalTransferException, InsufficientFundExdeption {
		// TODO Auto-generated method stub
		
	}

}
