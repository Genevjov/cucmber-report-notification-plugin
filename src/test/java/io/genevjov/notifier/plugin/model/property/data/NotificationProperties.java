package io.genevjov.notifier.plugin.model.property.data;

import io.genevjov.notifier.plugin.model.property.data.destination.Email;
import io.genevjov.notifier.plugin.model.property.data.destination.Slack;

public class NotificationProperties {

    private Type type;
    private Email email;
    private Slack slack;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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