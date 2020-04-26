package io.genevjov.notifier.plugin.notification;

import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.model.property.data.NotificationType;
import io.genevjov.notifier.plugin.model.property.data.ReportData;
import io.genevjov.notifier.plugin.notification.builders.NotificationBuilder;
import io.genevjov.notifier.plugin.notification.builders.impl.HtmlBasedNotificationBuilder;
import io.genevjov.notifier.plugin.notification.builders.impl.JsonBasedNotificationBuilder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class NotificationBuildingStrategy {

    Map<NotificationType, NotificationBuilder> notificationBuilderMap;

    public NotificationBuildingStrategy() {
        setUp();
    }

    public Notification build(ReportData reportData, Long duration) {
        File reportSource = new File(reportData.getReportFilePath());
        validateFile(reportSource);
        return notificationBuilderMap.get(reportData.getNotificationType()).build(reportSource, duration);

    }

    private void setUp() {
        this.notificationBuilderMap = new HashMap<>();
        notificationBuilderMap.put(NotificationType.HTML, new HtmlBasedNotificationBuilder());
        notificationBuilderMap.put(NotificationType.PLAIN_FAIL_REPORT, new JsonBasedNotificationBuilder());
    }

    private void validateFile(File file) {
        if (!file.exists() && file.isDirectory()) {
            throw new RuntimeException("Invalid report file");
        }
    }
}
