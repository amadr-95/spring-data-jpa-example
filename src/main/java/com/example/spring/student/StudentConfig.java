package com.example.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> repository.saveAll(
                List.of(new Student("Amador", "amador@gmail.com",
                                LocalDate.of(1995, Month.OCTOBER, 7)),
                        new Student("Sandra", "sandra@gmail.com",
                                LocalDate.of(2001, Month.AUGUST, 26)))
        );
    }
}
