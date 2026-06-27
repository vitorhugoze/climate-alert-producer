
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Wind {

    @SerializedName("direction")
    @Expose
    private Direction direction;
    @SerializedName("speed")
    @Expose
    private Speed speed;
    @SerializedName("gust")
    @Expose
    private Gust gust;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Gust getGust() {
        return gust;
    }

    public void setGust(Gust gust) {
        this.gust = gust;
    }

}
