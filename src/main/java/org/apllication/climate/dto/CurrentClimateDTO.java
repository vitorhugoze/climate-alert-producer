
package org.apllication.climate.dto;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CurrentClimateDTO {

    @SerializedName("currentTime")
    @Expose
    private String currentTime;
    @SerializedName("timeZone")
    @Expose
    private TimeZone timeZone;
    @SerializedName("isDaytime")
    @Expose
    private Boolean isDaytime;
    @SerializedName("weatherCondition")
    @Expose
    private WeatherCondition weatherCondition;
    @SerializedName("temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("feelsLikeTemperature")
    @Expose
    private FeelsLikeTemperature feelsLikeTemperature;
    @SerializedName("dewPoint")
    @Expose
    private DewPoint dewPoint;
    @SerializedName("heatIndex")
    @Expose
    private HeatIndex heatIndex;
    @SerializedName("windChill")
    @Expose
    private WindChill windChill;
    @SerializedName("relativeHumidity")
    @Expose
    private Double relativeHumidity;
    @SerializedName("uvIndex")
    @Expose
    private Double uvIndex;
    @SerializedName("precipitation")
    @Expose
    private Precipitation precipitation;
    @SerializedName("thunderstormProbability")
    @Expose
    private Double thunderstormProbability;
    @SerializedName("airPressure")
    @Expose
    private AirPressure airPressure;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("cloudCover")
    @Expose
    private Double cloudCover;
    @SerializedName("currentConditionsHistory")
    @Expose
    private CurrentConditionsHistory currentConditionsHistory;

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getIsDaytime() {
        return isDaytime;
    }

    public void setIsDaytime(Boolean isDaytime) {
        this.isDaytime = isDaytime;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public FeelsLikeTemperature getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(FeelsLikeTemperature feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    public DewPoint getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    public HeatIndex getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(HeatIndex heatIndex) {
        this.heatIndex = heatIndex;
    }

    public WindChill getWindChill() {
        return windChill;
    }

    public void setWindChill(WindChill windChill) {
        this.windChill = windChill;
    }

    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public Double getThunderstormProbability() {
        return thunderstormProbability;
    }

    public void setThunderstormProbability(Double thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
    }

    public AirPressure getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(AirPressure airPressure) {
        this.airPressure = airPressure;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public CurrentConditionsHistory getCurrentConditionsHistory() {
        return currentConditionsHistory;
    }

    public void setCurrentConditionsHistory(CurrentConditionsHistory currentConditionsHistory) {
        this.currentConditionsHistory = currentConditionsHistory;
    }

}
