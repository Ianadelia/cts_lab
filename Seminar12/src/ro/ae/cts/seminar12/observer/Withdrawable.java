package ro.ae.cts.seminar12.observer;



public interface Withdrawable {
	public abstract void withdraw(double amount)  throws InsufficientFundsException;
}
