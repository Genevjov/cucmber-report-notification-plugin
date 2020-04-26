package io.genevjov.notifier.plugin.model.property;

import io.genevjov.notifier.plugin.model.property.data.NotificationProperties;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.String.format;


public class PropertyLoader {

    private static final String REPORT_NOTIFICATION_PROPERTIES_PATH = "src/test/resources/report-notification.yml";

    public NotificationProperties load() {
        File propertyFile = loadFile();
        Yaml yaml = new Yaml(new Constructor(NotificationProperties.class));
        try (FileReader reader = new FileReader(propertyFile)) {
            return yaml.load(reader);
        } catch (IOException exception) {
            throw new RuntimeException("An error occurred while loading configuration", exception);
        }
    }

    private File loadFile() {
        File propertiesFile = new File(REPORT_NOTIFICATION_PROPERTIES_PATH);
        if (propertiesFile.exists()) {
            return propertiesFile;
        }
        throw new RuntimeException(format("Could not find configuration by path %s. Please provide it.", REPORT_NOTIFICATION_PROPERTIES_PATH));
    }
}
