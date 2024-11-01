package Notification;

public class NotificationService {
	private NotificationSender notificationSender;
	
	public NotificationService( NotificationSender notificationSender) {
		this.notificationSender = notificationSender;
	}
	
	public void send() {
		System.out.println("Sending Notification.....");
		notificationSender.sendNotification();
	}
}
