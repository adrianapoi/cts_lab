package ro.ase.cts.seminar2.interfaces;

import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;

public interface Withdarawable {
	public abstract void withdraw(double amount) throws InsufficientFundExdeption;

}
