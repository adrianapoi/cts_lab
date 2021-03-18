package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN1", 500);
		CurrentAccount c1=new CurrentAccount(200, "IBAN2", 500);
		c.setNotificationService(new SMSNotificationService());
		SavingAccount c2=new SavingAccount(300, "IBAN3");
		System.out.println("Suma disponibila: " +c.getBalance());
		System.out.println("Creditul maxim pentru cont curent este: " + CurrentAccount.MAX_CREDIT);	
		c.deposit(200);
		System.out.println("Suma disponibila: " +c.getBalance());
		try {
			c.withdraw(300);
			c.setNotificationService(new EmailNotificationService());
			c.withdraw(200);
			c.setNotificationService(new NotificationService() {
			
				@Override
				public void sendNotification(String message) {
					System.out.println("Sent PUSH notification with message: " + message);
					
				}
			});
			c.withdraw(200);
			c.trasfer(100, c);
			
		} catch (InsufficientFundExdeption | IlegalTransferException e) {
			System.err.println(e.getMessage());
		
		}
		System.out.println("Suma disponibila: " +c.getBalance());
		System.out.println("Suma disponibila in contul 2: " +c1.getBalance());
		System.out.println("Suma disponibila in contul 3: " +c2.getBalance());
		((Profitable)c2).addInterest(10);
		System.out.println("Suma disponibila in cont 3: " +c2.getBalance());
		c2.deposit(300);
		
		Bank banca=new Bank();
		
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT);
		
	}	
}
