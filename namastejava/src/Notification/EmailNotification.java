package Notification;

public class EmailNotification extends Notification implements NotificationSender {

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending Notification via EMAIL by implementing Notification sender");
	}
}
