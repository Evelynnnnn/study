package com.shilei.index.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Flyway 启动配置类
 */
@Configuration
public class FlywayConfig {

    @Value("${flyway.table:schema_version}")
    private String table;

    @Value("${flyway.baselineOnMigrate:true}")
    private Boolean baselineOnMigrate;

    @Value("${flyway.locations:classpath:/db/origin}")
    private String[] locations;
	
    @ConditionalOnProperty(name = "flyway.enabled", havingValue = "true")
    @Bean(initMethod = "migrate", autowire = Autowire.BY_TYPE)
    public Flyway getFlyway() {
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(baselineOnMigrate);
        flyway.setTable(table);
        flyway.setLocations(locations);
        return flyway;
    }

}
