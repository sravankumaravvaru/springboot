package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
            Student deepu = new Student(1L,
                    "deepu",
                    "deepurocks@gmail.com",
                    LocalDate.of(1998, DECEMBER, 21),
                    23
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, DECEMBER, 21),
                    26
            );
repository.saveAll(
        List.of(deepu,alex)
);
        };
    }
}
