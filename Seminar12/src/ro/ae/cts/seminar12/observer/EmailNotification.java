package ro.ae.cts.seminar12.observer;

public class EmailNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		System.out.println("Sending email " + amount+ "notification to user");
		
	}

}
