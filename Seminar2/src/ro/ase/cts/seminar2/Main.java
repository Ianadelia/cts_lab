package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN1");

		System.out.println("suma disponibila este:"+ c.getBalance());
        System.out.println("Creditul maxim pentru contul curent este: " + CurrentAccount.MAX_CREDIT);
	    c.deposit(200);
	    
	    System.out.println("suma disponibila este:"+ c.getBalance());
	    try {
			c.withdraw(200);
		} catch (InsufficientFundsException e) {
			System.err.println(e.getMessage());
		}
	    System.out.println("suma disponibila este:"+ c.getBalance());
	}

}
