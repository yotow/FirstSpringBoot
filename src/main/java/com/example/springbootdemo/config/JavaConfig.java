package com.example.springbootdemo.config;

import com.example.springbootdemo.model.DevProfile;
import com.example.springbootdemo.model.ProductionProfile;
import com.example.springbootdemo.model.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
