package Notification;

public abstract class Notification {
	
	NotificationSender sendNotif;
	
	public void sendNotification() {
		sendNotif.sendNotification();
	}
}
