package Notification;

public class SMSNotification extends Notification implements NotificationSender{
	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending Notification by SMS by implementing Notification sender");
	}
}
