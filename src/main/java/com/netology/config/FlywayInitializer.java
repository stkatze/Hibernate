package com.netology.config;

import lombok.AllArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@DependsOn("entityManagerFactory")
public class FlywayInitializer {
    @Autowired
    public FlywayInitializer(Flyway flyway) {
        flyway.migrate();
    }
}