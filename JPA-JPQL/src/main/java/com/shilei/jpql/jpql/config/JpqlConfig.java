package com.shilei.jpql.jpql.config;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpqlConfig {

    @Bean
    public VelocityEngine velocityEngine(){
        return new VelocityEngine();
    }
}
