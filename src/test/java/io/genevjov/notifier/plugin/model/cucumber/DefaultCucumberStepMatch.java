package io.genevjov.notifier.plugin.model.cucumber;

import java.util.List;

public class DefaultCucumberStepMatch {

    private String location;
    private List<DefaultCucumberStepArguments> arguments;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<DefaultCucumberStepArguments> getArguments() {
        return arguments;
    }

    public void setArguments(List<DefaultCucumberStepArguments> arguments) {
        this.arguments = arguments;
    }
}
