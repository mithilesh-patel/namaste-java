package Notification;

public class NotificationTest {
	public static void main(String[] args) {
				
		NotificationSender push = new PushNotification();
		NotificationSender email = new EmailNotification();
//		nt1.sendNotification();
//		nt2.sendNotification();
		
		NotificationService service = new NotificationService(email);
		service.send();

		NotificationService service2 = new NotificationService(push);
		service2.send();
	}
}
