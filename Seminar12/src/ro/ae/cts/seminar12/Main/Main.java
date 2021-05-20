package ro.ae.cts.seminar12.Main;

import java.util.ArrayList;

import ro.ae.cts.seminar12.observer.BankAccount;
import ro.ae.cts.seminar12.observer.CreditAccount;
import ro.ae.cts.seminar12.observer.EmailNotification;
import ro.ae.cts.seminar12.observer.InsufficientFundsException;
import ro.ae.cts.seminar12.observer.NotificationInterface;
import ro.ae.cts.seminar12.observer.SmsNotification;
import ro.ase.cts.Memento.CharacterMemento;
import ro.ase.cts.Memento.GameCharacter;

public class Main {

public static void main(String[] args) {
		
		CreditAccount account = new CreditAccount(1000,"codIban");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double ammount) {
				System.out.println("[inline example]: "+ammount+" extracted");
				
			}
		});
		
		NotificationInterface smsNotificationService = new SmsNotification();
		NotificationInterface emailNotificationService = new EmailNotification();
		
		account.addObserver(smsNotificationService);
		
		try {
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("-------------------------------------");
		ArrayList<CharacterMemento> saveList=new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Alex", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: "+myCharacter.getHitPoints());
	}

}
