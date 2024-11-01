package Notification;

public class PushNotification extends Notification implements NotificationSender{

	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending PUSH Notification by implementing Notification sender");
	}
}
