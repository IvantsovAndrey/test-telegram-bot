package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class LogopedistBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogopedistBotApplication.class, args);
    }
}
