package org.vertexium.mutation;

import org.vertexium.Visibility;

import java.io.Serializable;

public class SetPropertyMetadata implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String propertyKey;
    private final String propertyName;
    private final Visibility propertyVisibility;
    private final String metadataKey;
    private final Object newValue;
    private final Visibility metadataVisibility;
    private final long timestamp;

    public SetPropertyMetadata(
            String propertyKey,
            String propertyName,
            Visibility propertyVisibility,
            String metadataKey,
            Object newValue,
            Visibility metadataVisibility,
            long timestamp
    ) {
        this.propertyKey = propertyKey;
        this.propertyName = propertyName;
        this.propertyVisibility = propertyVisibility;
        this.metadataKey = metadataKey;
        this.newValue = newValue;
        this.metadataVisibility = metadataVisibility;
        this.timestamp = timestamp;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Visibility getPropertyVisibility() {
        return propertyVisibility;
    }

    public String getMetadataKey() {
        return metadataKey;
    }

    public Object getNewValue() {
        return newValue;
    }

    public Visibility getMetadataVisibility() {
        return metadataVisibility;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
