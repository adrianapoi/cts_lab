package ro.ase.cts.seminar2;

public abstract class Account {


	public abstract void withdraw(double amount);
	public abstract void trasfer(double amount, Account destination);
	public abstract double getBalance();
	public abstract void deposit(double amount);
	
	
}
