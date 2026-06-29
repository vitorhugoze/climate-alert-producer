package org.infrastructure.messaging;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.domain.model.Weather;
import org.domain.service.WeatherService;

import java.time.Duration;
import java.util.Optional;
import java.util.Properties;

public class WeatherProducer {

    private static final String BROKER_ADDRESS = System.getenv("BROKER_ADDRESS") != null ? System.getenv("BROKER_ADDRESS") : "localhost:9092";

    public static void produceWeatherMessages() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_ADDRESS);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, WeatherSerializer.class);

        int i = 1;
        try (KafkaProducer<String, Weather> producer = new KafkaProducer<>(props)) {
            while (true) {
                String latitude = "-26.902353";
                String longitude = "-49.092128";

                Optional<Weather> optWeather = WeatherService.GetCurrentWeather(latitude, longitude);
                if (optWeather.isPresent()) {
                    ProducerRecord<String, Weather> record = new ProducerRecord<>("climate-topic", "k" + i, optWeather.get());
                    producer.send(record);

                    System.out.println("Sent weather message: " + optWeather.get());
                }

                i++;
                Thread.sleep(Duration.ofMinutes(3));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
