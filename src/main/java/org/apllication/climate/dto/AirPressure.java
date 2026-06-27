
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AirPressure {

    @SerializedName("meanSeaLevelMillibars")
    @Expose
    private Double meanSeaLevelMillibars;

    public Double getMeanSeaLevelMillibars() {
        return meanSeaLevelMillibars;
    }

    public void setMeanSeaLevelMillibars(Double meanSeaLevelMillibars) {
        this.meanSeaLevelMillibars = meanSeaLevelMillibars;
    }

}
