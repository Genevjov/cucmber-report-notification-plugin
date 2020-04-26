package io.genevjov.notifier.plugin.model.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
public class DefaultCucumberStepArguments {

    private String val;
    private int offset;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return val;
    }
}
