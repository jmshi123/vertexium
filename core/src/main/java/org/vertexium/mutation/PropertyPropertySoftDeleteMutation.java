package org.vertexium.mutation;

import org.vertexium.Property;
import org.vertexium.Visibility;

public class PropertyPropertySoftDeleteMutation extends PropertySoftDeleteMutation {
    private final Property property;
    private final Long timestamp;

    public PropertyPropertySoftDeleteMutation(Property property, Long timestamp) {
        this.property = property;
        this.timestamp = timestamp;
    }

    @Override
    public String getKey() {
        return property.getKey();
    }

    @Override
    public String getName() {
        return property.getName();
    }

    @Override
    public Visibility getVisibility() {
        return property.getVisibility();
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Property getProperty() {
        return property;
    }
}
