package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.NotificationService;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN1");
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount c2=new CurrentAccount(200, "IBAN2");
		
		SavingsAccount c3= new SavingsAccount (300, "IBAN3");
        System.out.println("suma disponibila este:"+ c.getBalance());
        System.out.println("Creditul maxim pentru contul curent este: " + CurrentAccount.MAX_CREDIT);
	    c.deposit(200);
	    System.out.println("suma disponibila este:"+ c.getBalance());
		try {
			c.withdraw(200);
			c.setNotificationService(new NotificationService(){
			@Override
			public void sendNotification(String message) {
				System.out.println("Sent PUSH notification with message" + message);
			}
			});
			c.withdraw(200);
			c.transfer(100,c2);
		} catch (InsufficientFundsException  | IllegalTransferException e) {
			
		System.err.println(e.getMessage());
		}
		System.out.println("suma disponibila este:"+ c.getBalance());
		System.out.println("suma disponibila din contul 2 este: "+c2.getBalance());
		System.out.println("suma disponibila din contul 3 este: "+c3.getBalance());
	    ((SavingsAccount) c3).addInterest(10);
	    System.out.println("suma disponibila din contul 3 este: "+c3.getBalance());
	    c3.deposit(200);
	    

	    Bank banca=new Bank();
	    BankAccount account4= banca.openBankAccount(AccountType.CURRENT);
	}
	}


