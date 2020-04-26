package io.genevjov.notifier.plugin.model.property.data.destination;

import io.genevjov.notifier.plugin.model.property.data.SmtpMailProperties;

import java.util.List;

public class Email extends Destination{

    private List<String> receivers;
    private String sendFrom;
    private String subject;
    private SmtpMailProperties smtpMailProperties;

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public String getSendFrom() {
        return sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public SmtpMailProperties getSmtpMailProperties() {
        return smtpMailProperties;
    }

    public void setSmtpMailProperties(SmtpMailProperties smtpMailProperties) {
        this.smtpMailProperties = smtpMailProperties;
    }
}
