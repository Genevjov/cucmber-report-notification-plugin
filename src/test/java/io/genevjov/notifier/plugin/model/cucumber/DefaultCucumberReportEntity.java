package io.genevjov.notifier.plugin.model.cucumber;

import java.util.List;

public class DefaultCucumberReportEntity {
    private float line;
    private List<DefaultCucumberElement> elements;
    private String name;
    private String description;
    private String id;
    private String keyword;
    private String uri;
    private List<Object> tags;

    public float getLine() {
        return line;
    }

    public void setLine(float line) {
        this.line = line;
    }

    public List<DefaultCucumberElement> getElements() {
        return elements;
    }

    public void setElements(List<DefaultCucumberElement> elements) {
        this.elements = elements;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }
}
