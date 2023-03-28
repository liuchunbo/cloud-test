package org.example.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Creat by liuchunbo 2023/3/23
 */
@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Level.FULL;
    }
}
