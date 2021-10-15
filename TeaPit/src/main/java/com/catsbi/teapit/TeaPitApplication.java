package com.catsbi.teapit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TeaPitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeaPitApplication.class, args);
    }

}
