package com.sparta.nbcampspringpersonaltask2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NbcampSpringPersonalTask2Application {

    public static void main(String[] args) {
        SpringApplication.run(NbcampSpringPersonalTask2Application.class, args);
    }

}
