package com.samujjal.domain;

import java.net.URI;

/**
 * Created by samujjal on 16/09/16.
 */
public class Movie {
    String id;
    String name;
    String synopsis;
    URI eventUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public URI getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(URI eventUrl) {
        this.eventUrl = eventUrl;
    }
}
