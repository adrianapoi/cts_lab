package ro.ase.cts.factory;

public class ContDebit implements ContBancar {
	private double total = 100;

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
	public String toString() {
		return "ContDebit [total=" + total + "]";
	}

	

}
