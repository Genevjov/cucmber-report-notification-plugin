package io.genevjov.notifier.plugin.model.property.data;

import io.genevjov.notifier.plugin.model.property.data.destination.Email;
import io.genevjov.notifier.plugin.model.property.data.destination.Slack;

public class NotificationProperties {

    private ReportData reportData;
    private Email email;
    private Slack slack;

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        this.reportData = reportData;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Slack getSlack() {
        return slack;
    }

    public void setSlack(Slack slack) {
        this.slack = slack;
    }
}
