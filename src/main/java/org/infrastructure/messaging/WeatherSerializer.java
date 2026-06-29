package org.infrastructure.messaging;

import com.google.gson.Gson;
import org.apache.kafka.common.serialization.Serializer;
import org.domain.model.Weather;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class WeatherSerializer implements Serializer<Weather> {
    private final Gson gson = new Gson();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    @Override
    public byte[] serialize(String topic, Weather data) {
        return gson.toJson(data, Weather.class).getBytes(StandardCharsets.UTF_8);
    }
}
