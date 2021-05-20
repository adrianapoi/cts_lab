package ro.ase.cts.seminar12.observer;

import ro.ase.cts.seminar12.observer.InsufficientFundExdeption;

public interface Withdarawable {
	public abstract void withdraw(double amount) throws InsufficientFundExdeption;

}
