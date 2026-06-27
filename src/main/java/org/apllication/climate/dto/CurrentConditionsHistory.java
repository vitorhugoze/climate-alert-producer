
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CurrentConditionsHistory {

    @SerializedName("temperatureChange")
    @Expose
    private TemperatureChange temperatureChange;
    @SerializedName("maxTemperature")
    @Expose
    private MaxTemperature maxTemperature;
    @SerializedName("minTemperature")
    @Expose
    private MinTemperature minTemperature;
    @SerializedName("qpf")
    @Expose
    private Qpf__1 qpf;

    public TemperatureChange getTemperatureChange() {
        return temperatureChange;
    }

    public void setTemperatureChange(TemperatureChange temperatureChange) {
        this.temperatureChange = temperatureChange;
    }

    public MaxTemperature getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(MaxTemperature maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public MinTemperature getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(MinTemperature minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Qpf__1 getQpf() {
        return qpf;
    }

    public void setQpf(Qpf__1 qpf) {
        this.qpf = qpf;
    }

}
