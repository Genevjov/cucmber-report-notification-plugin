package io.genevjov.notifier.plugin.model.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.junit.Cucumber;

import java.util.ArrayList;
import java.util.List;

public class DefaultCucumberElement {

    @JsonProperty("start_timestamp")
    private String startTimestamp;
    private float line;
    private String name;
    private String description;
    private String id;
    private String type;
    private String keyword;
    private List<DefaultCucumberStep> steps;

    public String getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public float getLine() {
        return line;
    }

    public void setLine(float line) {
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<DefaultCucumberStep> getSteps() {
        return steps;
    }

    public void setSteps(List<DefaultCucumberStep> steps) {
        this.steps = steps;
    }
}
