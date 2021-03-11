package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;
import ro.ase.cts.seminar2.interfaces.Profitable;

public class SavingAccount extends BankAccount implements Profitable {

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundExdeption {
		if(amount<=this.balance)
		this.balance-=amount;		
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
		this.balance +=amount;		
	}

	@Override
	public void addInterest(double interest) {
		this.balance*=(1+interest/100);
		
	}

}
