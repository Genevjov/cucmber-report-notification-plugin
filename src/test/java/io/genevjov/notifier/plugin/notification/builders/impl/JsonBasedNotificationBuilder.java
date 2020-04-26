package io.genevjov.notifier.plugin.notification.builders.impl;

import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.model.cucumber.DefaultCucumberElement;
import io.genevjov.notifier.plugin.model.cucumber.DefaultCucumberReportEntity;
import io.genevjov.notifier.plugin.model.cucumber.DefaultCucumberStep;
import io.genevjov.notifier.plugin.notification.builders.NotificationBuilder;

import java.io.File;
import java.util.List;

import static java.lang.String.format;

public class JsonBasedNotificationBuilder implements NotificationBuilder {

    public static final String TEST_FAILED_MESSAGE_TEMPLATE = "️File %s - Scenario %s -- Step %s -- Arguments (%s) -- failed with message:\n %s\n️";
    public static final String TESTS_SUCCESS_MESSAGE_TEMPLATE = "All tests passed successfully !!!\n";
    public static final String DURATION_TEMPLATE = "Tests duration: %d sec";

    @Override
    public Notification build(File file, Long duration) {
        Notification notification = new Notification();
        List<DefaultCucumberReportEntity> reportEntities = parseJsonReport(file);
        String message = generateMessage(reportEntities).concat(format(DURATION_TEMPLATE, duration));
        notification.setMessage(message);
        notification.setReport(file);
        return notification;
    }

    private String generateMessage(List<DefaultCucumberReportEntity> reportEntities) {
        StringBuilder failMessageBuilder = new StringBuilder();
        for (DefaultCucumberReportEntity reportEntity : reportEntities) {
            for (DefaultCucumberElement element : reportEntity.getElements()) {
                for (DefaultCucumberStep step : element.getSteps()) {
                    if (!isPassed(step)) {
                        failMessageBuilder.append(format(TEST_FAILED_MESSAGE_TEMPLATE,
                                reportEntity.getUri(),
                                element.getName(), step.getName(),
                                step.getMatch().getArguments(),
                                step.getResult().getErrorMessage()));
                    }
                }
            }
        }
        if (failMessageBuilder.length() > 0) {
            return failMessageBuilder.toString();
        }
        return TESTS_SUCCESS_MESSAGE_TEMPLATE;
    }

    private boolean isPassed(DefaultCucumberStep step) {
        return step.getResult().getStatus().equals("passed");
    }


}
