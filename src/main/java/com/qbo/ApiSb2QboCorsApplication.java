package com.qbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiSb2QboCorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSb2QboCorsApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configuracionCors() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/estado/**")
				.allowedMethods("GET", "POST")
				.allowedOrigins("*");
			
			}
			
		};
		
		
	}
	
}
