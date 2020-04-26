package io.genevjov.notifier.plugin.model.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefaultCucumberStepResult {

    private float duration;
    private String status;
    @JsonProperty("error_message")
    private String errorMessage;

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
