package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;

public abstract class Account {


	public abstract void withdraw(double amount) throws InsufficientFundExdeption;
	public abstract void trasfer(double amount, Account destination) throws IlegalTransferException, InsufficientFundExdeption;
	public abstract double getBalance();
	public abstract void deposit(double amount);
	
	
}
