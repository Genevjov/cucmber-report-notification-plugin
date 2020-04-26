package io.genevjov.notifier.plugin.model.property.data.destination;

public class Slack extends Destination{

    private String webHook;

    public String getWebHook() {
        return webHook;
    }

    public void setWebHook(String webHook) {
        this.webHook = webHook;
    }
}
