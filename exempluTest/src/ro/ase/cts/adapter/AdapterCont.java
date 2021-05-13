package ro.ase.cts.adapter;

import ro.ase.cts.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar {
	private double total = 500;

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total -= suma;
		destinatie.depune(suma);

		System.out.println(suma + "de lei a fost adaugata in " + destinatie + " ->Debit");

	}

	@Override
	public void depune(double suma) {
		total += suma;
		System.out.println(suma + " de lei au fost adaugati in contul curent -> Debit");

	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.transfer(this, amount);
	}

	@Override
	public String toString() {
		return "AdapterCont [total=" + total + "]";
	}

	

}
