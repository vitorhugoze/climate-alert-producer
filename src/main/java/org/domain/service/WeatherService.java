package org.domain.service;

import org.apllication.climate.CurrentClimateIntegration;
import org.apllication.climate.dto.CurrentClimateDTO;
import org.domain.model.Weather;
import org.infrastructure.mappers.WeatherMapper;

import java.util.Optional;

public class WeatherService {

    public static Optional<Weather> GetCurrentWeather(String latitude, String longitude) {
        try {
            CurrentClimateDTO climateDTO = CurrentClimateIntegration.requestCurrentClimate(latitude, longitude);
            return Optional.of(WeatherMapper.CurrentClimateDTOToWeather(climateDTO, latitude, longitude));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
