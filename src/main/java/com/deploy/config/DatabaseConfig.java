package com.deploy.config;

import org.springframework.context.annotation.Configuration;
import java.util.TimeZone;

@Configuration
public class DatabaseConfig {
    
    public DatabaseConfig() {
        // Set the default timezone to UTC for the entire JVM
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}

