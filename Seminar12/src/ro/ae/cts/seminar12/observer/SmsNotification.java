package ro.ae.cts.seminar12.observer;

public class SmsNotification implements NotificationInterface{


	@Override
	public void notifyUser(double amount) {
		System.out.println("Sending message to user");
		
	}

}
