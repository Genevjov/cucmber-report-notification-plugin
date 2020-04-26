package io.genevjov.notifier.plugin.notification.builders.impl;

import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.notification.builders.NotificationBuilder;

import java.io.File;

import static java.lang.String.format;

public class HtmlBasedNotificationBuilder implements NotificationBuilder {
    @Override
    public Notification build(File file, Long duration) {
        Notification notification = new Notification();
        notification.setMessage(format("Test report has been generated! Tests duration is %d", duration));
        notification.setReport(file);
        return notification;
    }
}
