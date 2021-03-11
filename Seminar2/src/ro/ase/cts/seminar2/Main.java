package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN1");
        CurrentAccount c2=new CurrentAccount(200, "IBAN2");
		SavingsAccount c3= new SavingsAccount (300, "IBAN3");
        System.out.println("suma disponibila este:"+ c.getBalance());
        System.out.println("Creditul maxim pentru contul curent este: " + CurrentAccount.MAX_CREDIT);
	    c.deposit(200);
	    System.out.println("suma disponibila este:"+ c.getBalance());
		try {
			c.withdraw(600);
			c.transfer(200,c2);
		} catch (InsufficientFundsException e) {
			
			System.err.println(e.getMessage());
		} catch (IllegalTransferException e) {
			
			System.err.println(e.getMessage());
		}
		System.out.println("suma disponibila este:"+ c.getBalance());
		System.out.println("suma disponibila din contul 2 este: "+c2.getBalance());
		System.out.println("suma disponibila din contul 3 este: "+c3.getBalance());
	    c3.addInterest(10);
	    System.out.println("suma disponibila din contul 3 este: "+c3.getBalance());
	    Bank banca=new Bank();
	    BankAccount account4= banca.openBankAccount(AccountType.CURRENT);
	}
	}


