package io.genevjov.notifier.plugin.notification.builders;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.model.cucumber.DefaultCucumberReportEntity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface NotificationBuilder {

    Notification build(File file, Long duration);

    default List<DefaultCucumberReportEntity> parseJsonReport(File reportSource) {
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class,
                DefaultCucumberReportEntity.class);
        try {
         return  objectMapper.readValue(reportSource, type);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
