package com.ead.notification.dtos;

import com.ead.notification.enums.NotificationSatus;

import javax.validation.constraints.NotNull;

public class NotificationDto {

    @NotNull
    private NotificationSatus notificationSatus;

    public NotificationSatus getNotificationSatus() {
        return notificationSatus;
    }

    public void setNotificationSatus(NotificationSatus notificationSatus) {
        this.notificationSatus = notificationSatus;
    }
}
