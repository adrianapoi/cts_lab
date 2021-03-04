package ro.ase.cts.seminar2;

public abstract class BankAccount extends Account {
//mosteneste clasa account si are toate metodele ei, dar find abstracta nu este obligatoriu sa avem def pt metode; 
	protected double balance;
	public String iban;
	
	public BankAccount() {
		this.balance=0;
		this.iban="";
	}
	
	public BankAccount(double balance, String iban) {
		this.balance=balance;
		this.iban=iban;
	}
	
	@Override
	public double getBalance() {
		//override ins definirea altei functionalitati, fata de cea din parinte
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
}
