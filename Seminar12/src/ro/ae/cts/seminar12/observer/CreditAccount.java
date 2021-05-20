package ro.ae.cts.seminar12.observer;





public class CreditAccount extends BankAccount implements Depositable, Withdrawable{

	//entitate observabil concret
	
	public CreditAccount(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void deposit(double amount) {
		if(amount>0) {
		this.balance += amount;
		
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		//metoda care are rolul de a notifica observator
		if(amount <= this.balance) {
		this.balance -= amount;
		
	}
      for(NotificationInterface observer:this.observers) {
    	  
      }
	}

}
