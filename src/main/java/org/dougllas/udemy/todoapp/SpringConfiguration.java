package org.dougllas.udemy.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by DOUGLLAS SOUSA on 20/09/2017.
 */

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("org.dougllas.udemy.todoapp.model")
@ComponentScan(basePackages = "org.dougllas.udemy")
@EnableJpaRepositories(basePackages = "org.dougllas.udemy.todoapp.repository")
public class SpringConfiguration extends SpringBootServletInitializer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringConfiguration.class, args);
    }

}