package com.netology.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {
    @Bean
    public Flyway flyway() {
        return Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/netology", "postgres", "postgres")
                .locations("db/migration/postgresql")
                .defaultSchema("hibernate")
                .baselineOnMigrate(true)
                .load();
    }
}