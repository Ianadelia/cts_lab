package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class SavingsAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable {

	

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
		
	}

	public SavingsAccount() {
		this.balance=0;
		this.iban="";
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance)
		this.balance -= amount;
		
	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban))
		{
			throw new IllegalTransferException("transfer ilegal!");
		}
		else
		{
			this.withdraw(amount);
			((Depositable) destination).deposit(amount);
		}
		
	}

	@Override
	public void addInterest(double interest) {
		this.balance *= (1+interest/100);
		
	}

}
