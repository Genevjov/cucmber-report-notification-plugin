package io.genevjov.notifier.plugin.model.property.data;

public class ReportData {

    private NotificationType notificationType;
    private ReportFileType reportFileType;
    private String reportFilePath;

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public ReportFileType getReportFileType() {
        return reportFileType;
    }

    public void setReportFileType(ReportFileType reportFileType) {
        this.reportFileType = reportFileType;
    }

    public String getReportFilePath() {
        return reportFilePath;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }
}
