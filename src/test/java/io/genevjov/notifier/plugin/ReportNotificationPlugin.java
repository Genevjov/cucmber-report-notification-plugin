package io.genevjov.notifier.plugin;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import io.genevjov.notifier.integration.SlackSender;
import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.model.property.data.NotificationProperties;
import io.genevjov.notifier.plugin.notification.NotificationBuildingStrategy;

import java.time.Duration;
import java.time.Instant;

public class ReportNotificationPlugin implements ConcurrentEventListener {

    private Instant testStartTime;

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        EventHandler<TestRunStarted> testRunStartedEventHandler = this::handleTestStarted;
        EventHandler<TestRunFinished> testRunFinishedEventHandler = this::handleTestFinished;
        eventPublisher.registerHandlerFor(TestRunStarted.class, testRunStartedEventHandler);
        eventPublisher.registerHandlerFor(TestRunFinished.class, testRunFinishedEventHandler);
    }

    private void handleTestStarted(Event event) {
        this.testStartTime = event.getInstant();

    }

    private void handleTestFinished(Event event) {
        Duration duration = Duration.between(testStartTime, event.getInstant());
        NotificationProperties notificationProperties = new PropertyLoader().load();
        NotificationBuildingStrategy notificationBuildingStrategy = new NotificationBuildingStrategy();
        Notification notification = notificationBuildingStrategy.build(
                notificationProperties.getReportData(), duration.getSeconds());
        SlackSender slackSender = new SlackSender();
        try {

            slackSender.send(notification, notificationProperties.getSlack().getWebHook());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
