package lalli.niit.Dao;

import java.util.List;

import lalli.niit.models.Notification;

public interface NotificationDao {
void addNotification(Notification notification);
List<Notification> getAllNotificationsNotViewed(String email);
Notification getNotification(int notificationId);
void updateNotificactionViewedStatus(int notificationId);
}