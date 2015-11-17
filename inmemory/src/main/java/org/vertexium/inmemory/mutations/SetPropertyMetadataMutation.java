package org.vertexium.inmemory.mutations;

import org.vertexium.Visibility;

public class SetPropertyMetadataMutation extends PropertyMutation {
    private final String metadataKey;
    private final Object newValue;

    public SetPropertyMetadataMutation(
            Long timestamp,
            String propertyKey, String propertyName, Visibility propertyVisibility,
            String metadataKey, Visibility metadataVisibility,
            Object newValue
    ) {
        super(timestamp, propertyKey, propertyName, propertyVisibility, metadataVisibility);
        this.metadataKey = metadataKey;
        this.newValue = newValue;
    }

    public String getMetadataKey() {
        return metadataKey;
    }

    public Object getNewValue() {
        return newValue;
    }
}
