package io.genevjov.notifier.plugin;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.Event;
import io.cucumber.plugin.event.EventHandler;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.genevjov.notifier.plugin.model.property.PropertyLoader;
import io.genevjov.notifier.plugin.model.property.data.NotificationProperties;

public class ReportNotificationPlugin implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        EventHandler<TestRunFinished> testSourceReadHandler = this::handleTestFinished;
        eventPublisher.registerHandlerFor(TestRunFinished.class, testSourceReadHandler);
    }

    private void handleTestFinished(Event event) {
        // TODO add implementation
    }
}
