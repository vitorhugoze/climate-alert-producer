
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Precipitation {

    @SerializedName("probability")
    @Expose
    private Probability probability;
    @SerializedName("qpf")
    @Expose
    private Qpf qpf;

    public Probability getProbability() {
        return probability;
    }

    public void setProbability(Probability probability) {
        this.probability = probability;
    }

    public Qpf getQpf() {
        return qpf;
    }

    public void setQpf(Qpf qpf) {
        this.qpf = qpf;
    }

}
