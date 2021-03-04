package ro.ase.cts.seminar2;

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
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trasfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		//this.setBalance(getBalance() + amount);
		this.balance+= amount;
	}

	
}
