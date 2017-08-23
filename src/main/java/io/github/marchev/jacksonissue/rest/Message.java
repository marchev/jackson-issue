package io.github.marchev.jacksonissue.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("message")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
