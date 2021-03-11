package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public abstract class Account {
public abstract void deposit(double amount);
public abstract void withdraw(double amount)  throws InsufficientFundsException;
public abstract void transfer(double amount, Account destination) throws InsufficientFundsException, IllegalTransferException;
public abstract double getBalance();
}
