package com.example.service_center.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class SwaggerConfig {
 
    @Bean
    public OpenAPI bookingOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("ServiceCenter Service API")
                .description("API documentation for ServiceCenter microservice")
                .version("v1.0"));
    }
}
