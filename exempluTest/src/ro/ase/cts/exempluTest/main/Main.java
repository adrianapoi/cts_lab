package ro.ase.cts.exempluTest.main;

import ro.ase.cts.adapter.AdapterCont;
import ro.ase.cts.adapter.BankAccount;
import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.singleton.SingleBanca;

public class Main {

	public static void main(String[] args) {
		SingleBanca single=SingleBanca.getInstance("BCR", "Centru");
		
		ContBancar cont1=single.createInstance("CREDIT");
		System.out.println(SingleBanca.NRCONT);
		
		
		ContBancar cont2=single.createInstance("DEBIT");
		System.out.println(SingleBanca.NRCONT);
		
		System.out.println(cont1);
		System.out.println(cont2);
		
		
		////--------ADAPTER--------
		ContBancar adapterCont=new AdapterCont();
		System.out.println(adapterCont);
		
		BankAccount bankAccount=new AdapterCont();
		System.out.println(adapterCont);

		adapterCont.transfer(cont1,200);
		System.out.println(adapterCont);
		
		adapterCont.depune(500);
		System.out.println(adapterCont);
		
		((BankAccount)adapterCont).accountTransfer(bankAccount, 200);
		System.out.println(adapterCont);
		}


}
