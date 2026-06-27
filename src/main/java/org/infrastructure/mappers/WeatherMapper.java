package org.infrastructure.mappers;

import org.apllication.climate.dto.CurrentClimateDTO;
import org.domain.model.Weather;
import org.domain.model.WeatherVariable;
import org.domain.model.WeatherVariableType;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class WeatherMapper {

    public static Weather CurrentClimateDTOToWeather(CurrentClimateDTO currentClimateDTO, String latitude, String longitude) {
        LocalDateTime timestamp = Instant.parse(currentClimateDTO.getCurrentTime()).atZone(ZoneOffset.UTC).toLocalDateTime();;

        return Weather.newBuilder()
                .withLatitude(latitude)
                .withLongitude(longitude)
                .withTimestamp(timestamp)
                .addClimateData(new WeatherVariable(WeatherVariableType.HUMIDITY, currentClimateDTO.getRelativeHumidity()))
                .addClimateData(new WeatherVariable(WeatherVariableType.PRESSURE, currentClimateDTO.getAirPressure().getMeanSeaLevelMillibars()))
                .addClimateData(new WeatherVariable(WeatherVariableType.PRECIPITATION, currentClimateDTO.getPrecipitation().getQpf().getQuantity()))
                .addClimateData(new WeatherVariable(WeatherVariableType.WIND_SPEED, currentClimateDTO.getWind().getSpeed().getValue()))
                .addClimateData(new WeatherVariable(WeatherVariableType.TEMPERATURE, currentClimateDTO.getTemperature().getDegrees()))
                .build();


    }

}
