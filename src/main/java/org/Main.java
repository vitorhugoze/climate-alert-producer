package org;

import org.infrastructure.messaging.WeatherProducer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WeatherProducer.produceWeatherMessages();
    }
}
