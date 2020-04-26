package io.genevjov.notifier.plugin.model;

import java.io.File;

public class Notification {

    private String message;
    private File report;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public File getReport() {
        return report;
    }

    public void setReport(File report) {
        this.report = report;
    }
}
