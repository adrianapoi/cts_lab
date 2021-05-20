package ro.ase.cts.seminar12.observer;


public class CreditAccount extends BankAccount implements Depositable, Withdarawable{

	//enitate observabil concret
	public CreditAccount(double balance, String iban) {
		super(balance,iban);
		
	}
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}	
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundExdeption {
		//metoda care are rolul de a modifica observatorii
		if(amount>0) {
			this.balance -= amount;
		}
		for (NotificationInterface observer: this.observers) {
			observer.notifyUser(amount);
		}
	}

}