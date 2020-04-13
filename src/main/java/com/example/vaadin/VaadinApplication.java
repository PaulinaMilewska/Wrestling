package com.example.vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EnableJpaAuditing
public class VaadinApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaadinApplication.class, args);
    }

}
