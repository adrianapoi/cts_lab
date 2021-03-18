package ro.ase.cts.seminar2.interfaces;

import ro.ase.cts.seminar2.Account;
import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;

public interface Transfererable {
	public abstract void trasfer(double amount, Depositable destination) throws IlegalTransferException, InsufficientFundExdeption;
}
