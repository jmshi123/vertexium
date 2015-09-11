package org.vertexium.mutation;

import org.vertexium.Visibility;

public class KeyNameVisibilityPropertySoftDeleteMutation extends PropertySoftDeleteMutation {
    private final String key;
    private final String name;
    private final Long timestamp;
    private final Visibility visibility;

    public KeyNameVisibilityPropertySoftDeleteMutation(String key, String name, Long timestamp, Visibility visibility) {
        this.key = key;
        this.name = name;
        this.timestamp = timestamp;
        this.visibility = visibility;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public Visibility getVisibility() {
        return visibility;
    }
}
