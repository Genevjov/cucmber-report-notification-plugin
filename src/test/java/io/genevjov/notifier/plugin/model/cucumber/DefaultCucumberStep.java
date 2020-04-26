package io.genevjov.notifier.plugin.model.cucumber;

public class DefaultCucumberStep {

    private DefaultCucumberStepResult result;
    private float line;
    private String name;
    private DefaultCucumberStepMatch match;
    private String keyword;

    public DefaultCucumberStepResult getResult() {
        return result;
    }

    public void setResult(DefaultCucumberStepResult result) {
        this.result = result;
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

    public DefaultCucumberStepMatch getMatch() {
        return match;
    }

    public void setMatch(DefaultCucumberStepMatch match) {
        this.match = match;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
