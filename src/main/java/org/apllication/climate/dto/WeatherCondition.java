
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class WeatherCondition {

    @SerializedName("iconBaseUri")
    @Expose
    private String iconBaseUri;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("type")
    @Expose
    private String type;

    public String getIconBaseUri() {
        return iconBaseUri;
    }

    public void setIconBaseUri(String iconBaseUri) {
        this.iconBaseUri = iconBaseUri;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
